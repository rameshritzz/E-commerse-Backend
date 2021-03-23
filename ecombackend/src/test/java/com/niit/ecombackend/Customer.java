package com.niit.ecombackend;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.Customer_DAO;
import com.niit.ecombackend.config.BBConfig;
import com.niit.ecombackend.model.customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BBConfig.class)

public class Customer {
	
	customer c;
	@Autowired
	Customer_DAO custdao;

	@Before
	public void setUp() throws Exception {
	c=new customer();
	c.setCust_name("ryeg");
	c.setCust_email("rames1234@gmail.com");
	c.setCust_phno("741567813");
	}
	
     
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//assertEquals(true,custdao.addCustomer(c));
		
	//	
//		Customer c1=custdao.selectOneCustomer("ramesh12@gmail.com");
//		String phno=c1.getCust_Phno();
		
//		c1.setCust_Phno("1234567890");
//		custdao.updateCustomer(c1);
//		Customer c2=custdao.selectOneCustomer("ramesh12@gmail.com");
//		assertEquals(false, phno.equals(c2.getCust_Phno()));
		
	
		customer c3=custdao.SelectOneCustomer("ramesh12@gmail.com");
	custdao.deleteCustomer(c3);
		assertNotNull(c3);
		
		//customer c4=custdao.SelectOneCustomer("ramesh12@gmail.com");
		//custdao.deleteCustomer(c4);
		
	}

}
