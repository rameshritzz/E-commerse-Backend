package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.category_DAO;
import com.niit.ecombackend.model.category;


@Repository
@Transactional
public class category_DAOImpl implements category_DAO {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean addcategory(category b) {
		try {
			sf.getCurrentSession().save(b);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public boolean updatecategory(category b) {
		try {
			sf.getCurrentSession().update(b);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}

	}

	@Override
	public boolean deletecategory(category b) {
		try {
			sf.getCurrentSession().delete(b);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());

			return false;
		}
	}

	@Override
	public category SelectOnecategory(int catid) {
		try {
			return (category) sf.getCurrentSession().createCriteria(category.class)
					.add(Restrictions.eq("cateid", catid)).uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<category> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(category.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
