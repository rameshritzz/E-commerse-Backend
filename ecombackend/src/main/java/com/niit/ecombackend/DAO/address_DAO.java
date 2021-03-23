package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.address;


public interface address_DAO {
	boolean addaddress(address r);
    boolean updateaddress(address r);
    boolean deleteaddress(address r);
    address SelectOneaddress(int address_id);
    List<address> selectAll(int userid);
}
