package com.niit.ecombackend.Impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecombackend.DAO.register_DAO;
import com.niit.ecombackend.model.UserCred;
import com.niit.ecombackend.model.register;


@Repository // category_dao cate_dao=new category_daoimpl();
@Transactional
public class register_DAOImpl implements register_DAO {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean addregister(register c) {

		try {
			UserCred uc = new UserCred();
			uc.setEmailid(c.getReg_Email());
			uc.setUser_password(c.getReg_Pass());
			uc.setUser_role("ROLE_USER");
			uc.setUser_status("True");
			sf.getCurrentSession().save(c);
			sf.getCurrentSession().save(uc);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public boolean updateregister(register c) {
		try {
			sf.getCurrentSession().update(c);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public boolean deleteregister(register c) {
		try {
			sf.getCurrentSession().delete(c);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public register selectOneregister(String email) {
		try {
			return (register) sf.getCurrentSession().createCriteria(register.class)
					.add(Restrictions.eq("reg_Email", email)).uniqueResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return null;
		}
	}

	@Override
	public List<register> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(register.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return null;
		}
	}

}
