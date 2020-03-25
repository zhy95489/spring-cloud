package com.laozhu.service;

import com.laozhu.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService  {

    boolean add(Product product);
    Product get(Long id);
    List<Product> list();

}
