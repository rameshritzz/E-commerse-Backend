package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.customer;




public interface Customer_DAO {
	 boolean addCustomer(customer b);
     boolean updateCustomer(customer b);
     boolean deleteCustomer(customer b);
     customer SelectOneCustomer(String cust_email);
     List<customer> selectAll();
}
