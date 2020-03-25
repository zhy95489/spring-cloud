package com.laozhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laozhu.entity.Product;
import com.laozhu.mapper.ProductMapper;
import com.laozhu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        int insert = productMapper.insert(product);

        return insert > 0? true:false;
    }

    @Override
    public Product get(Long id) {
        return productMapper.selectById(id);
    }

    @Override
    public List<Product> list() {
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>();
        return productMapper.selectList(productQueryWrapper);
    }
}
