package com.niit.ecombackend;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.seller_DAO;
import com.niit.ecombackend.config.BBConfig;
import com.niit.ecombackend.model.seller;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BBConfig.class)

public class sellerinsert {
    seller c;
    @Autowired
    seller_DAO selldao;
    
    @Before
	public void setUp() throws Exception {
	c=new seller();
	
	c.setSellername("ram");
	c.setSellerlocation("cbe");
	}
	
     
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	assertEquals(true,selldao.addseller(c));
		
	//	
//		seller c1=selldao.selectOneseller("ramesh12@gmail.com");
//		String phno=c1.getCust_Phno();
		
//		c1.setCust_Phno("1234567890");
//		selldao.updateseller(c1);
//		category c2=selldao.selectOneseller("ramesh12@gmail.com");
//		assertEquals(false, phno.equals(c2.getCust_Phno()));
		
	
	//	category c3=selldao.SelectOnecategory("ramesh12@gmail.com");
	//catdao.deleteseller(c3);
	//	assertNotNull(c3);
		
		//customer c4=selldao.SelectOneseller("ramesh12@gmail.com");
		//selldao.deleteseller(c4);
		
	}

}
