package com.example.crud.springbootcrud.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="reg_sb")

public class RegisterVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firstname;
	
	@Column(name="lastName")
	private String lastname;
	
	@Column(name="email")
	private String email;

	@Column(name="contactnumber")
	private int contactnumber;
	
	
	@Column(name="status")
	private boolean status=true;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}


}
