package com.example.crud.springbootcrud.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.crud.springbootcrud.VO.RegisterVO;

@Repository
public class RegisterDAOImpl  implements RegisterDAO{

	@Autowired SessionFactory sessionFactory;
	
	public void insert(RegisterVO registerVO) {
		// TODO Auto-generated method stub
	
		Session session=this.sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(registerVO);
	}

}
