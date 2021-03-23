package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.order_DAO;

import com.niit.ecombackend.model.myorder;
@Repository
@Transactional
public class order_DAOImpl implements order_DAO {

	@Autowired
	SessionFactory sf;

	@Override
	public boolean addorder(myorder r) {
		try {
			sf.getCurrentSession().save(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public boolean updateorder(myorder r) {
		try {
			sf.getCurrentSession().update(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}


	}

	@Override
	public boolean deleteorder(myorder r) {
		try {
			sf.getCurrentSession().delete(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}
	@Override
	public myorder SelectOneorder(String order_id) {
		try {
			return (myorder) sf.getCurrentSession().createCriteria(myorder.class)
					.add(Restrictions.eq("order_id", order_id)).uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<myorder> selectAll(int userid) {
		try {
			return sf.getCurrentSession().createCriteria(myorder.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
