/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.defalt.mycomponent;

import java.util.ArrayList;

/**
 *
 * @author ming
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private String image;

    public Product(int id, String name, double price, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + '}';
    }public static ArrayList<Product> genProductList(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1,"Espresso 1",40,"1.jpg"));
        list.add(new Product(2,"Espresso 2",30,"2.jpg"));
        list.add(new Product(3,"Espresso 3",40,"3.jpg"));
        list.add(new Product(4,"Americano 1",30,"1.jpg"));
        list.add(new Product(5,"Americano 2",40,"2.jpg"));
        list.add(new Product(1,"Americano 3",50,"3.jpg"));
        list.add(new Product(1,"Ice Tea 1",40,"1.jpg"));
        list.add(new Product(1,"Ice Tea 2",40,"2.jpg"));
        list.add(new Product(1,"Ice Tea 3",40,"3.jpg"));
        return list;
    }
}
