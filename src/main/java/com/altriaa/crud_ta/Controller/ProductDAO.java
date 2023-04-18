/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.altriaa.crud_ta.Controller;

import com.altriaa.crud_ta.Model.Product;
import java.util.List;

/**
 *
 * @author Altriaa
 */
public interface ProductDAO {
    public void insert(Product product);
    public void update(Product product);
    public void delete(Product product);
    public Product getProduct(int productId);
    public List<Product> list();
}
