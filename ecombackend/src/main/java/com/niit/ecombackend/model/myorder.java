package com.niit.ecombackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class myorder {
    
	@Id
	String order_id;
	
	@ManyToOne
	register reg_user;
	
	@ManyToOne
	product pro;
	
	@ManyToOne
	address add;
	
	Date date;
	@Column(nullable=false)
	int qty;
	@Column(nullable=false)
	float total;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public register getReg_user() {
		return reg_user;
	}
	public void setReg_user(register reg_user) {
		this.reg_user = reg_user;
	}
	public product getPro() {
		return pro;
	}
	public void setPro(product pro) {
		this.pro = pro;
	}
	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
}
