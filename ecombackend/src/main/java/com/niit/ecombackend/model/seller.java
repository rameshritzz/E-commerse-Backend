package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class seller {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int sellerid;
	@Column(nullable=false,unique=true)
	@NotEmpty(message="SELLER NAME CANNOT BE BLANK")
	@Pattern(regexp="[a-zA-Z]*$",message="Seller name can only have Alphabets")
	
	String sellername;
	@Column(nullable=false)
	String sellerlocation;
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getSellerlocation() {
		return sellerlocation;
	}
	public void setSellerlocation(String sellerlocation) {
		this.sellerlocation = sellerlocation;
	}

}
