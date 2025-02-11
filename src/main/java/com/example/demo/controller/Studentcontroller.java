package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Studententity;
import com.example.demo.repository.Studentrepo;

@RestController
public class Studentcontroller {

	@Autowired
private Studentrepo repo;
	
	@PostMapping("/adddetails") 
	public Studententity addetails(@RequestBody Studententity studentdata) {
		try {
			repo.save(studentdata);
			return new  Studententity();
		}catch(IllegalArgumentException e){
			return new Studententity();
		}
		
	}
	
	@PutMapping("/updatedetails")
	public Studententity updatedetails(@RequestBody Studententity studentdata) {
		try {
			
			repo.save(studentdata);
			return  new Studententity();
		}catch(IllegalArgumentException e){
			return new Studententity();
		}
	 
	}
	
	@GetMapping ("/getdata")
	public List<Studententity> getdata(){
		try {
			return repo.findAll();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		return null;
	}
	

	    
	    @DeleteMapping("/delete/{id}")
	    public String getFoodById(@PathVariable int id) {
		    try {
		   Studententity studentdata = repo.getById(id);
		   repo.delete(studentdata);
		   return "data deleted succesfully";
		    } catch (IllegalArgumentException e) {
		        e.printStackTrace();  
		    }
		    return null;
	}
	    




}
