package com.laozhu.controller;

import com.laozhu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

/**
 * @author zhy
 * @date 2019/11/28 11:54
 */
@RestController
public class ProductController_Consumer {

    private static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @Author: zhy
     * @date: 2019/11/28
     * @Param:
     * @return:
     */
    @PostMapping(value = "/consumer/product/add")
    public Boolean add(Product product) {
        //ResponseEntity<Object> objectResponseEntity = restTemplate.postForEntity(REST_URL_PREFIX + "/product/add", product, Object.class);
        //System.out.println(objectResponseEntity);
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }

    @GetMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @GetMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }

}

