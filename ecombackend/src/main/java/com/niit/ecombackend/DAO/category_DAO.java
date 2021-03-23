package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.category;

public interface category_DAO {
	boolean addcategory(category b);

	boolean updatecategory(category b);

	boolean deletecategory(category b);

	category SelectOnecategory(int catid);

	List<category> selectAll();

}
