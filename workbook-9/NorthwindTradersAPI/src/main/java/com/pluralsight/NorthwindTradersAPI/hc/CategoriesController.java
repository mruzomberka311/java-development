package com.pluralsight.NorthwindTradersAPI.hc;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
    ArrayList<Category> categories = new ArrayList<>();
    categories.add(1, "Electronics");
    categories.add(2, "Decor");
    categories.add(3, "Misc.");

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories (@PathVariable List<Category> categories){
        return categories;
    }
}
