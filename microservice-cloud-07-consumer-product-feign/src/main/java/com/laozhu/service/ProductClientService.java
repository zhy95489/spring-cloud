package com.laozhu.service;

import com.laozhu.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * zhy
 */
@FeignClient(value = "MICROSERVICE-PRODUCT" ,fallback = ProductClientServiceFallBack.class)
public interface ProductClientService {


    @GetMapping(value = "/product/get/{id}")
    Product get(@PathVariable("id") Long id);

    @GetMapping(value = "/product/list")
    List<Product> list();

    @PostMapping(value = "/product/add")
    boolean add(Product product);
}
