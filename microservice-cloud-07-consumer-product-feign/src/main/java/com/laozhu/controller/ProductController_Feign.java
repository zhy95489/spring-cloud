package com.laozhu.controller;

import com.laozhu.entity.Product;
import com.laozhu.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController_Feign {
    @Autowired
    private ProductClientService service;


    @PostMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }

    @GetMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }
}
