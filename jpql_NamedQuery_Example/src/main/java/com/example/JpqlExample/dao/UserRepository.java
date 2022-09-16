package com.example.JpqlExample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.JpqlExample.model.User1;



@Repository

public interface UserRepository extends CrudRepository<User1,Integer> {

	
	//@Query("select u FROM User u")
	public List<User1> getAllUser();

	//@Query(value ="SELECT u FROM User u WHERE u.name=?1 AND u.city=?2")
	public List<User1> findByNameAndCity(String name, String city);
	
//	@Query(value ="SELECT u FROM User u WHERE u.name=?1" )
	public List<User1> findByName(String name);
}
