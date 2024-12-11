package controllers;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


@RestController
public class HomeController {


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "World") String country) {
        return ("Hello" + country + "!");
    }
}

