package com.cts.grizzly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Category;
import com.cts.grizzly.dao.CategoryDAO;





@Service("categoryService")
@Transactional(propagation=Propagation.SUPPORTS)
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO ;

	

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		System.out.println("In service");
		return categoryDAO.getAllCategories();
	}

	
}