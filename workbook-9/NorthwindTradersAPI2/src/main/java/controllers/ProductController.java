package controllers;

import interfaces.IProductDao;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private IProductDao productDao;


    @Autowired
    public ProductController(IProductDao productDao) {
        this.productDao = productDao;
    }


    @RequestMapping(path = "/products" , method = RequestMethod.GET)
        public List<Product> getAllProducts(@PathVariable List<Product> products){
            return products;
        }

        @RequestMapping(path = "/products", method = RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public void insertProduct(@RequestBody Product product){
        productDao.insertProduct(product);
        }

        @RequestMapping(path = "/products/{product_id}", method = RequestMethod.PUT)
    public void updateProduct(@PathVariable int productId, @RequestBody Product product){
            productDao.updateProduct(productId,product);
        }

        @RequestMapping(path = "/products/{product_id}",method = RequestMethod.DELETE)
        @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable int productId){
            productDao.deleteProduct(productId);
        }
}
