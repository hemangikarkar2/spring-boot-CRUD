package com.javalearn.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalearn.crud.example.service.PersonService;
import com.javalearn.crud.exmple.entity.Person;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/addPerson")
	public Person addPersonDetail(@RequestBody Person person){
		
		return personService.savepersondetial(person);
		
	}
	@PostMapping("/addPersons")
	public List<Person> addPersons(@RequestBody List<Person> persons){
		
		return personService.savepersons(persons);
		
	}
	@GetMapping("/Persons")
	public List<Person> findAllPersons(){
		
		return personService.getPersonDetials();
		
	}
	@GetMapping("/Person/{id}")
	public Person findPersonById(@PathVariable int id){
		
		return personService.getPersonById(id);
	
	}
	@GetMapping("/Person/{firstname}")
	public Person findPersonByName(@PathVariable String firstname){
		
		return personService.getPersonByfirstname(firstname);
	
	}
	@PutMapping("/update")
	public Person  updatePerson(@RequestBody Person person){
		return personService.updatePerson(person);
		
	}
	@DeleteMapping("/delete/{id}")
	public String  deletePerson(@PathVariable int id){
		return personService.deletePeson(id);
		
	}
	}
