package com.laozhu.controller1;

import com.laozhu.entity.Product;
import com.laozhu.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
public class ProductController1 {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/product/add1")
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping(value = "/product/get1/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @GetMapping(value = "/product/list1")
    public List<Product> list() {
        return productService.list();
    }

}
