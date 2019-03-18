package com.cts.grizzly.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Profile;
import com.cts.grizzly.bean.Login;
@Repository("profileDAO")
@Transactional
public class ProfileDAOImpl implements ProfileDAO {
	@Autowired
	private SessionFactory sessionFactory;
		
		
	//@Qualifier("sessionFactory")
		
	@Transactional(readOnly=true)

		public Profile getUserType(String userType) {
			// TODO Auto-generated method stub
			org.hibernate.Session session = null;
			String query = "from Profile where userId=?";
			org.hibernate.query.Query<Profile> query2 = null;
			
			
			
			
			try {
				session = sessionFactory.getCurrentSession();
				
				query2 = session.createQuery(query);
				query2.setParameter(0, userType);
				
				Profile profile = query2.getSingleResult();
				return profile;
				// TODO: handle exception
				
			}
			finally {
				
			}
			
		}
}
