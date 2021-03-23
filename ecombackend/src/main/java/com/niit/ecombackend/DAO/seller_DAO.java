package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.seller;


public interface seller_DAO
{
	 boolean addseller(seller b);
     boolean updateseller(seller b);
     boolean deleteseller(seller b);
     seller SelectOneseller(int selid);
     List<seller> selectAll();

	
	
	


}
