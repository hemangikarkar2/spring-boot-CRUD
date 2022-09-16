package com.javalearn.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.crud.exmple.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	Person findByName(String firstname);


	
}
