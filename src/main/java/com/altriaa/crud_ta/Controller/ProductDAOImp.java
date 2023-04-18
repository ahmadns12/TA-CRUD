/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altriaa.crud_ta.Controller;

import com.altriaa.crud_ta.DB.ConnectionDataBase;
import com.altriaa.crud_ta.Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Altriaa
 */
public class ProductDAOImp {
     public void insert(Product product) {
        try {
            Connection conDB =  ConnectionDataBase.getConnection();
            String sql = "INSERT INTO product_novel (productGenre,productName,price,qty) VALUES (?,?,?,?)";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setString(1, product.getProductGenre());
            ps.setString(2, product.getProductName());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQty());
            ps.executeUpdate();
            System.out.println("Data has been saved");
        }  
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot insert into table");
        }
    }
     
    public void update(Product product) {
       try {
           Connection conDB =  ConnectionDataBase.getConnection();
           String sql = "UPDATE product_novel SET productGenre =?, productName=?, price=?, qty=? WHERE productId=?";
           PreparedStatement ps = conDB.prepareStatement(sql);
           ps.setString(1, product.getProductGenre());
           ps.setString(2, product.getProductName());
           ps.setDouble(3, product.getPrice());
           ps.setInt(4, product.getQty());
           ps.setInt(5, product.getProductId());
           ps.executeUpdate();
           System.out.println("Data has been update");
       }  
       catch (Exception e) {
           e.printStackTrace();
           System.out.println("Cannot update into table");
       }
    }
    
    public void delete(Product product) {
        try {
            Connection conDB =  ConnectionDataBase.getConnection();
            String sql = "DELETE FROM product_novel WHERE productId=?";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setInt(1, product.getProductId());
            ps.executeUpdate();
            System.out.println("Data has been delete");
        }  
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot delete into table");
        }
    }   
    
    public Product getProduct(int productId) {
        Product product = new Product();
        try {
            Connection conDB = ConnectionDataBase.getConnection();
            String sql = "SELECT * FROM product_novel WHERE productId=?";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                product.setProductId(rs.getInt("productId"));
                product.setProductGenre(rs.getString("productGenre"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getInt("price"));
                product.setQty(rs.getInt("qty"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot get data from table by using productId");
        }
        return product;
    }
    
     public List<Product> list() {
      
        List<Product> listProduct = new ArrayList<Product>();

        try{
            Connection conDB = ConnectionDataBase.getConnection();
            String sql = "SELECT * FROM product_novel";
            PreparedStatement ps = conDB.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Product product = new Product();
                product.setProductId(rs.getInt("productId"));
                product.setProductGenre(rs.getString("productGenre"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getInt("price"));
                product.setQty(rs.getInt("qty"));
 
                listProduct.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot get data from table");
        }
        return listProduct;
    }
}
