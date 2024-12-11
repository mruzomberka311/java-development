package interfaces;

import models.Category;

import java.util.List;

public interface ICategoryDao {

    public List<Category> getAllCategories();

    void updateCategory(int categoryId, Category category);

    void deleteCategory(int categoryId);


}
