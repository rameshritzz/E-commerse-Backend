package com.niit.ecombackend.DAO;

import java.util.List;


import com.niit.ecombackend.model.myorder;



public interface order_DAO {
	boolean addorder(myorder r);
    boolean updateorder(myorder r);
    boolean deleteorder(myorder r);
    myorder SelectOneorder(String order_id);
    List<myorder> selectAll(int userid);

}

