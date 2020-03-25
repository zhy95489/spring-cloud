package com.laozhu.controller;

import com.laozhu.entity.Product;
import com.laozhu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController
public class ProductController {

    @Value("${zhuhaoyu.name}")
    private String name;

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/product/add")
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping(value = "/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @GetMapping(value = "/product/list")
    public List<Product> list() {
        return productService.list();
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return name;
    }
}
