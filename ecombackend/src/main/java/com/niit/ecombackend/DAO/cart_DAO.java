package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.cart;



public interface cart_DAO {
	boolean addcart(cart r);
    boolean updatecart(cart r);
    boolean deletecart(cart r);
    cart SelectOnecart(int cart_id);
    List<cart> selectAll(int userid);

}

