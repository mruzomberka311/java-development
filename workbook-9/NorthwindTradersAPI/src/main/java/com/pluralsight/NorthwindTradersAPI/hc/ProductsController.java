package com.pluralsight.NorthwindTradersAPI.hc;


import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.io.*;



@RestController
public class ProductsController {
    ArrayList<Product> products = new ArrayList<>();

  products.add(1, "Laptop", 1, 129.00);
  products.add(4, "Lamp", 2, 24.99);
  products.add(3, "Pencil", 3, 2.99);

    @RequestMapping(path = "/products" , method = RequestMethod.GET)
    public List <Product> getAllProducts(@PathVariable List<Product> products){
        return products;
    }
}
