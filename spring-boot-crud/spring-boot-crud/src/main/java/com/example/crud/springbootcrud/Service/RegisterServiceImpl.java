package com.example.crud.springbootcrud.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.crud.springbootcrud.DAO.RegisterDAO;
import com.example.crud.springbootcrud.VO.RegisterVO;

@Service
@Transactional

public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDAO registerDAO;
	
	public void insert(RegisterVO registerVO) {
		// TODO Auto-generated method stub
		this.registerDAO.insert(registerVO);
	}

}
