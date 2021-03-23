package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.address_DAO;
import com.niit.ecombackend.model.address;

@Repository
@Transactional
public class address_DAOImpl implements address_DAO {
	@Autowired
	SessionFactory sf;


	@Override
	public boolean addaddress(address r) {
		try {
			sf.getCurrentSession().save(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public boolean updateaddress(address r) {
		try {
			sf.getCurrentSession().update(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}

	}

	@Override
	public boolean deleteaddress(address r) {
		try {
			sf.getCurrentSession().delete(r);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public address SelectOneaddress(int address_id) {
		try {
			return (address) sf.getCurrentSession().createCriteria(address.class)
					.add(Restrictions.eq("address_id", address_id)).uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	@Override
	public List<address> selectAll(int userid) {
		try {
			return sf.getCurrentSession().createQuery("from address where reg_user_reg_Id=" + userid).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	
	}}
