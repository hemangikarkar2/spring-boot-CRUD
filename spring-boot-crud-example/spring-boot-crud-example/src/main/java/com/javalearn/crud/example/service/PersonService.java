  package com.javalearn.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalearn.crud.example.repository.PersonRepository;
import com.javalearn.crud.exmple.entity.Person;

@Service

public class PersonService {

	@Autowired
	private PersonRepository personrepository;
	
	public Person savepersonDetail(Person person){
		
		return personrepository.save(person);	
	}

	public List<Person> savepersonsdetials(List<Person> persons){
		
		return personrepository.saveAll(persons);	
	}
	
	public List<Person> getPersonDetials(){
		
		return personrepository.findAll();
		
	}
	public Person getPersonById(int id){
		return personrepository.findById(id).orElse(null);
		
	}
	public Person getDetailByName(String firstname){
		
		return personrepository.findByName(firstname);
		
	}
	 public String deletePeson(int id){
		
		 personrepository.deleteById(id);
		 
		 return "person is removed!!" +id;
		 
	 }
	 public Person updatePerson(Person person)
	 {
		Person ExistingPerson = personrepository.findById(person.getId()).orElse(null);
		 ExistingPerson.setFirstname(person.getFirstname());
		 ExistingPerson.setLastname(person.getLastname());
		 ExistingPerson.setEmail(person.getEmail());
		 ExistingPerson.setContactnumber(person.getContactnumber());
		 
		 return personrepository.save(ExistingPerson);
		 
	 }

	public Person savepersondetial(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> savepersons(List<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getPersonByfirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
  