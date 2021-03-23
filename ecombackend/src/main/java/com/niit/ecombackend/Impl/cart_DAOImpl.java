package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.cart_DAO;
import com.niit.ecombackend.model.cart;


@Repository
@Transactional
public class cart_DAOImpl implements cart_DAO {

	@Autowired
	SessionFactory sf;

	@Override
	public boolean addcart(cart r) {
		try {
			sf.getCurrentSession().save(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public List<cart> selectAll(int userid) {
		try {
			return sf.getCurrentSession().createQuery("from cart where cust_reg_Id=" + userid).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public boolean updatecart(cart r) {
		try {
			sf.getCurrentSession().update(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public boolean deletecart(cart r) {
		try {
			sf.getCurrentSession().delete(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public cart SelectOnecart(int cart_id) {
		try {
			return (cart) sf.getCurrentSession().createCriteria(cart.class).add(Restrictions.eq("cart_id", cart_id))
					.uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
