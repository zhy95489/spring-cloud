package com.laozhu.service;


import com.laozhu.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //不要少了
public class ProductClientServiceFallBack implements ProductClientService {

    @Override
    public Product get(Long id) {
        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }
}
