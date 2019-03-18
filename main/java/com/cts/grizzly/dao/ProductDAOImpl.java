package com.cts.grizzly.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Product;




@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	
	private SessionFactory sessionFactory;
	
	@Transactional
	

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session= null;
		session = sessionFactory.getCurrentSession();
		
		System.out.println("Inside DAO product");
		
		session.save(product);
		System.out.println("Tuple inserted");
		
		
		return "Inserted";
	}

	
	}
