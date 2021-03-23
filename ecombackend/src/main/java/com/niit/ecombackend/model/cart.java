package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cart_id;
	@ManyToOne
	register cust;
	@ManyToOne
	product p;
	@Column(nullable = false)
	int quantity;
	@Column(nullable = false)
	float total;

	public register getCust() {
		return cust;
	}

	public void setCust(register cust) {
		this.cust = cust;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public product getP() {
		return p;
	}

	public void setP(product p) {
		this.p = p;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}
