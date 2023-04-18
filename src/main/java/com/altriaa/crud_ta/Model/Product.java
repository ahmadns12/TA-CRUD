    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altriaa.crud_ta.Model;

/**
 *
 * @author Altriaa
 */
public class Product {
    private int productId;
    private String productGenre;
    private String productName;
    private double price;
    private int qty;

    public int getProductId() {
        return productId;
    }
 
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductGenre() {
        return productGenre;
    }
 
    public void setProductGenre(String productGenre) {
        this.productGenre = productGenre;
    }

    public String getProductName() {
        return productName;
    }
 
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }
 
    public void setQty(int qty) {
        this.qty = qty;
    }
}
