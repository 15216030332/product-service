package com.learn.productService.domain;

import java.io.Serializable;

public class Product implements Serializable {

    /**
     * 无参数构造器是必需的
     */
    public Product() {
    }

    public Product(int id, String name, double price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    private int id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 价格
     */
    private double price;

    /**
     * 库存
     */
    private int store;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
