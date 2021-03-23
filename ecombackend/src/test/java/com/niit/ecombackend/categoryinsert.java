package com.niit.ecombackend;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.category_DAO;
import com.niit.ecombackend.config.BBConfig;
import com.niit.ecombackend.model.category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BBConfig.class)


public class categoryinsert {
	
	category c;
	@Autowired
	category_DAO catdao;

	@Before
	public void setUp() throws Exception {
	c=new category();
	
	c.setCatename("lens1.5");;
	c.setCatedescription("about lens");
	}
	
     
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	assertEquals(true,catdao.addcategory(c));
		
	//	
//		Customer c1=custdao.selectOnecategory("ramesh12@gmail.com");
//		String phno=c1.getCust_Phno();
		
//		c1.setCust_Phno("1234567890");
//		catdao.updatecategory(c1);
//		category c2=custdao.selectOnecategory("ramesh12@gmail.com");
//		assertEquals(false, phno.equals(c2.getCust_Phno()));
		
	
	//	category c3=catdao.SelectOnecategory("ramesh12@gmail.com");
	//catdao.deletecategory(c3);
	//	assertNotNull(c3);
		
		//customer c4=catdao.SelectOnecategory("ramesh12@gmail.com");
		//catdao.deletecategory(c4);
		
	}

}
