package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.seller_DAO;
import com.niit.ecombackend.model.seller;

@Repository
@Transactional
public class seller_DAOImpl implements seller_DAO {

	@Autowired
	SessionFactory sf;
		@Override
		public boolean addseller(seller b) {
	  try {
		  sf.getCurrentSession().save(b);
		  return true;
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  
			return false;
		}}

		@Override
		public boolean updateseller(seller b) {
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
		public boolean deleteseller(seller b) {
			 try {
				  sf.getCurrentSession().delete(b);
				  return true;
			  }
			  catch(Exception e) {
				  System.out.println(e.getMessage());
			  
					return false;
				}}		
		

		@Override
		public seller SelectOneseller(int selid) {
			 try {
				return (seller)sf.getCurrentSession().createCriteria(seller.class).add(Restrictions.eq("sellerid", selid)).uniqueResult();
				
			 }catch (Exception e) {
				System.out.println(e.getMessage());
				return null;
			}}
		

		@Override
		public List<seller> selectAll() {
			try {
				return sf.getCurrentSession().createCriteria(seller.class).list();
			 }catch (Exception e) {
				System.out.println(e.getMessage());
				return null;
			}}
}

		
		