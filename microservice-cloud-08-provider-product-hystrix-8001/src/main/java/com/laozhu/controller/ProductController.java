package com.laozhu.controller;

import com.laozhu.entity.Product;
import com.laozhu.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/product/add")
    public boolean add(@RequestBody Product product) throws Exception {
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "getFallback")
    @GetMapping(value = "/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {

        Product product = productService.get(id);
        if (product == null){
            throw new RuntimeException("id"+id+"无效");
        }
        return product;
    }

    @GetMapping(value = "/product/list")
    public List<Product> list() {
        return productService.list();
    }

    public Product getFallback(@PathVariable("id") Long id){
        return new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }

    public boolean addFallback(@RequestBody Product product){
        return false;
    }
}
