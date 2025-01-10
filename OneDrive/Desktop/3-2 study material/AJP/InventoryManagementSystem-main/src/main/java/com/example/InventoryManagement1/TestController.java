package com.example.InventoryManagement1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/home/")
    public String home2() {
        return "home";
    }

    @RequestMapping("/add")
    public String addProduct() {
        return "addProduct";
    }

}
