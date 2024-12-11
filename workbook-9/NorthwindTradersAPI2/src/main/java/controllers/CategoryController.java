package controllers;

import interfaces.ICategoryDao;
import models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private ICategoryDao categoryDao;


    @Autowired
    public CategoryController(ICategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }


    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories(@PathVariable List<Category> categories) {
        return categories;
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.PUT)
    public void updateCategory(@PathVariable int categoryId, @RequestBody Category category) {
        categoryDao.updateCategory(categoryId, category);
    }


    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable int categoryId){
        categoryDao.deleteCategory(categoryId);
    }






}
