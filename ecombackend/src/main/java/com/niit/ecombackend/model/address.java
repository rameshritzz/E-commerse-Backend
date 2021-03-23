package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int address_id;
	@Column(nullable=false)
	String cust_name;
	@Column(nullable = false, unique = true)
	@NotEmpty(message = "ADDRESS LINE1 CAN NOT BE BLANK")
	String addressline1;
	@Column(nullable = false, unique = true)
	String addressline2;
	@Column(nullable = false, unique = true)
	@NotEmpty(message = "AREA CAN NOT BE BLANK")
	String area;
	@Column(nullable = false, unique = true)
	@Pattern(regexp="[0-9]{6}",message="INVALID PINCODE")
	String pincode;
	@Column(nullable = false, unique = true)
	@Pattern(regexp="[9876][0-9]{9}",message="Number must begin with 9867 and most have 10 digit")
	String phoneno;
	@ManyToOne
	register reg_user;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public register getReg_user() {
		return reg_user;
	}

	public void setReg_user(register reg_user) {
		this.reg_user = reg_user;
	}

	
	
}
