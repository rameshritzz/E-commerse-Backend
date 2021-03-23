package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.product;



public interface product_DAO {
	boolean addproduct(product b);
    boolean updateproduct(product b);
    boolean deleteproduct(product b);
    product SelectOneproduct(int pro_id);
    List<product> selectAll();
}
