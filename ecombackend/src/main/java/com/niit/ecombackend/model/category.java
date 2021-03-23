package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class category {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int cateid;
	@Column(nullable=false,unique=true)
	String catename;
	@Column(columnDefinition="text")
	String catedescription;
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	public String getCatedescription() {
		return catedescription;
	}
	public void setCatedescription(String catedescription) {
		this.catedescription = catedescription;
	}

}
