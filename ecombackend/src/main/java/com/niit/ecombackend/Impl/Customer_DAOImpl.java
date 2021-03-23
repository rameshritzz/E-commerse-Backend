package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.Customer_DAO;
import com.niit.ecombackend.model.customer;

@Repository
@Transactional
public class Customer_DAOImpl implements Customer_DAO {
	@Autowired
SessionFactory sf;
	@Override
	public boolean addCustomer(customer b) {
  try {
	  sf.getCurrentSession().save(b);
	  return true;
  }
  catch(Exception e) {
	  System.out.println(e.getMessage());
  
		return false;
	}}

	@Override
	public boolean updateCustomer(customer b) {
		 try {
			  sf.getCurrentSession().update(b);
			  return true;
		  }
		  catch(Exception e) {
			  System.out.println(e.getMessage());
		  
				return false;
			}
	
	}

	@Override
	public boolean deleteCustomer(customer b) {
		 try {
			  sf.getCurrentSession().delete(b);
			  return true;
		  }
		  catch(Exception e) {
			  System.out.println(e.getMessage());
		  
				return false;
			}}		
	

	@Override
	public customer SelectOneCustomer(String cust_email) {
		 try {
			return (customer)sf.getCurrentSession().createCriteria(customer.class).add(Restrictions.eq("cust_email", cust_email)).uniqueResult();
			
		 }catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}}
	

	@Override
	public List<customer> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(customer.class).list();
		 }catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}}}
