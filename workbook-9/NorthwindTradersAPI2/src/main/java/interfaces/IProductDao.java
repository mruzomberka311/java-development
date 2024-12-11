package interfaces;

import models.Product;

import java.util.List;

public interface IProductDao {

    public List<Product> getAllProducts();

    Product insertProduct(Product product);

    void updateProduct(int productId, Product product);

    void deleteProduct(int productId);
}
