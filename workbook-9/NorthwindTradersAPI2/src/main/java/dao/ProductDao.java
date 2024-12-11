package dao;

import interfaces.IProductDao;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.AbstractConnectionFactoryConfigurer;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao implements IProductDao {
    private DataSource dataSource;

    @Autowired
    public ProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products");) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_Id");
                String productName = resultSet.getString("product_name");
                int categoryId = resultSet.getInt("category_Id");
                double unitPrice = resultSet.getDouble("unit_price");
                Product product = new Product(productId, productName, categoryId, unitPrice);
                products.add(product);

            }


        } catch (Exception e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        return products;
    }


    @Override
    public Product insertProduct(Product product) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products (product_id, product_name, category_id, unit_price) VALUES(?,?,?,?)");) {
            preparedStatement.setInt(1, product.getProductId());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setInt(3, product.getCategoryId());
            preparedStatement.setDouble(4, product.getUnitPrice());

            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        return product;
    }


    @Override
    public void updateProduct(int productId, Product product) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE products SET product_id = ?, product_name = ?, category_Id = ?, unit_price = ?");) {
            preparedStatement.setInt(1, product.getProductId());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setInt(3, product.getCategoryId());
            preparedStatement.setDouble(4, product.getUnitPrice());
            preparedStatement.executeUpdate();


        } catch (Exception e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int productId) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM products WHERE product_id = ?");) {
            preparedStatement.setInt(1, productId);
            preparedStatement.executeUpdate();


        } catch (Exception e) {
            System.out.println("An error has occurred");
            e.printStackTrace();

        }
    }
}
