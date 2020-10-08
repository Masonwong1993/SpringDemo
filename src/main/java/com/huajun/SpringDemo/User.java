package com.huajun.SpringDemo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;



@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	@Size(min=1, message="Firstname should have more than one character")
	private String firstname;
	@Size(min=1, message="Lastname should have more than one character")
	private String lastname;
	private String email;
	@Size(min=1, message="YYYY-mm-dd")
	private String birthdate;
	@Size(min=1, message="male, female, other")
	private String gender;


	public User() {

	}
	public User(Long id,String firstname, String lastname, String email, String birthdate, String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.birthdate = birthdate;
		this.gender = gender;
	}
	public String getFirstName() {

		return firstname;
	}
	public void setFirstName(String name) {

		this.firstname = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getBirthdate(){
		return birthdate;
	}
	public void setBirthdate(String birthdate){
		this.birthdate = birthdate;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "JAVAStudent [" + "firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", birthdate="+birthdate+", gender"+gender +"]";
	}



}
