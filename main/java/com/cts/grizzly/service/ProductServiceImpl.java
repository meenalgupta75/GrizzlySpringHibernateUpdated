package com.cts.grizzly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Product;
import com.cts.grizzly.dao.ProductDAO;
@Service("productService")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	ProductDAO productDAO;
	
	
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("inside product service");
		System.out.println(product);
		return productDAO.addProduct(product);
	}
}