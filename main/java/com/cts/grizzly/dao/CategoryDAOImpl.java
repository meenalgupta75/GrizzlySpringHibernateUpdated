package com.cts.grizzly.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
@Autowired
	private SessionFactory sessionFactory;
@Transactional

	
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
	Session session=null;
	String query="from Category";
	org.hibernate.query.Query<Category> query2=null;
	System.out.println("in category dao");
	
	session = sessionFactory.getCurrentSession();
	query2=session.createQuery(query);
	List<Category> list = query2.getResultList();
	System.out.println("inside dao- get all category");
	System.out.println("all category retrieved");
		return list;
	}

}
