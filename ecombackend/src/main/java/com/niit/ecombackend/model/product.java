package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class product
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int pro_id;
	
	@Column(nullable=false,unique=true)
	String pro_name;
	
	@Column(columnDefinition="text")
	String pro_desp;
	
	@ManyToOne
	category pro_cate;
	
	@ManyToOne
	seller pro_sell;
	@Column(nullable=false)
	int stock;
	
	@Column(nullable=false)
	float price;
	@Transient
	MultipartFile pimage;
	
	public MultipartFile getPimage() {
		return pimage;
	}
	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_desp() {
		return pro_desp;
	}
	public void setPro_desp(String pro_desp) {
		this.pro_desp = pro_desp;
	}
	public category getPro_cate() {
		return pro_cate;
	}
	public void setPro_cate(category pro_cate) {
		this.pro_cate = pro_cate;
	}
	public seller getPro_sell() {
		return pro_sell;
	}
	public void setPro_sell(seller pro_sell) {
		this.pro_sell = pro_sell;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
