package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int cust_Id;
	@Column(nullable=false)
	String cust_name;
	
	@Column(nullable=false,unique=true)
	String cust_email;
	
	@Column(nullable=false,unique=true,length=10)
	String cust_phno;


	public int getCust_Id() {
		return cust_Id;
	}


	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public String getCust_email() {
		return cust_email;
	}


	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}


	public String getCust_phno() {
		return cust_phno;
	}


	public void setCust_phno(String cust_phno) {
		this.cust_phno = cust_phno;
	}
	
	
	
	
}
