package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studententity {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;
	private int age;
	private String number;
	private String email;
	private String password;
	
	public Studententity(String number,String email,String password) {
		setNumber(number);
		setEmail(email);
		setPassword( password);
	}
	
	public void setNumber(String number) {
		if(number==null ||!number.matches("^[0-9]{10}$")) {
			throw new IllegalArgumentException("Number must be a 10-digit number") ;
			
		}
		this.number=number;
		
	}
	
	public void setEmail(String email) {
		if (email==null ||!email.matches("^[a-z A-Z 0-9._%+-]+@gmail\\.com$")) {
			throw new IllegalArgumentException("Email must be a vaild gmail address ");
		}
		this.email=email;
		
	}
	
	public void setPassword(String password) {
		if(password==null ||password.length()<6) {
			throw new IllegalArgumentException("Password must be at least 6 Characters long:");
			
		}
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	
	

	public String getPassword() {
		return password;
	}

	
	

	public String getEmail() {
		return email;
	}

	public Studententity(int id, String name, int age, String number, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = email;
		this.password = password;
	}

	public Studententity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

