package com.hti.shopmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopManagerController {
    @GetMapping("/index")
    public String index() {
        return "Welcome to Shop Manager";
    }
}
