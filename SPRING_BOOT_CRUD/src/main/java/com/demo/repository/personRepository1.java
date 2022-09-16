package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.RegisterVO;

public interface personRepository1  extends JpaRepository<RegisterVO, Integer>{

	RegisterVO findById(int id);

}
