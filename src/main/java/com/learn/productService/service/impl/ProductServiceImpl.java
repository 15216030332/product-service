package com.learn.productService.service.impl;

import com.learn.productService.domain.Product;
import com.learn.productService.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    private static Map<Integer,Product> dataMap = new HashMap<>();

    static{
        Product p1 = new Product(1,"iphone-x",8567,100);
        Product p2 = new Product(2,"iphone-xmax",11000,80);
        Product p3 = new Product(3,"iphone8",4888,90);
        Product p4 = new Product(4,"iphone7",2500,85);
        dataMap.put(p1.getId(),p1);
        dataMap.put(p2.getId(),p2);
        dataMap.put(p3.getId(),p3);
        dataMap.put(p4.getId(),p4);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> values = dataMap.values();
        List<Product> list = new ArrayList<>(values);
        return list;
    }

    @Override
    public Product findById(int id) {
        return dataMap.get(id);
    }
}
