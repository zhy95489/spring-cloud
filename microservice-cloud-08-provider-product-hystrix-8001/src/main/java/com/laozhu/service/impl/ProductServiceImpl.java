package com.laozhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laozhu.entity.Product;
import com.laozhu.mapper.ProductMapper;
import com.laozhu.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    @Transactional
    public boolean add(Product product) throws Exception {
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
