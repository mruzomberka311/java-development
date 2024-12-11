package dao;

import config.DataConfig;
import interfaces.ICategoryDao;
import models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@Component
public class CategoryDao implements ICategoryDao {

    private DataSource dataSource;

    @Autowired
    public CategoryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAllCategories(){
        List<Category> categories = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM categories"); ){
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int categoryId = resultSet.getInt("category_Id");
                String categoryName = resultSet.getString("category_name");
                Category category = new Category(categoryId,categoryName);
                categories.add(category);
            }


        }catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        return categories;
}

@Override
    public void updateCategory(int categoryId,Category category){
        try (Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE categories SET category_id = ? category_name = ?");){
         preparedStatement.setInt(1, category.getCategoryId());
         preparedStatement.setString(2, category.getCategoryName());
         preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
}

@Override
public void deleteCategory(int categoryId) {
    try (Connection connection = dataSource.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM categories WHERE category_id = ?");) {
        preparedStatement.setInt(1, categoryId);
        preparedStatement.executeUpdate();

    } catch (Exception e) {
        System.out.println("An error has occurred");
        e.printStackTrace();
    }

}

}
