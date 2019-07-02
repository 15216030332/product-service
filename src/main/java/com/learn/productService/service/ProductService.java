package com.learn.productService.service;

import com.learn.productService.domain.Product;

import java.util.List;

public interface ProductService {

    /**
     * 所有商品列表
     * @return
     */
    List<Product> listProduct();

    /**
     * 根据id查找商品
     * @param id
     * @return
     */
    Product findById(int id);
}
