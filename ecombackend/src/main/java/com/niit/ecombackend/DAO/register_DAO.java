package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.register;


public interface register_DAO {
	boolean addregister(register c);

	boolean updateregister(register c);

	boolean deleteregister(register c);

	register selectOneregister(String email);

	List<register> selectAll();

}
