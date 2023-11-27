package com.admin.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.Admin;
import com.admin.service.AdminService;
import com.admin.serviceImpl.AdminServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/admin")
@RequiredArgsConstructor
public class AdminController {

	private final AdminServiceImpl serviceImpl;
	
	
	@PostMapping("/save-user")
	public ResponseEntity<Admin>addUser(@RequestBody Admin admin){
		
		 Admin admin2 = serviceImpl.saveUser(admin);
		
		return new ResponseEntity<Admin>(admin2,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Admin>getUserById(@PathVariable int id){
		 Admin admin = serviceImpl.getUserById(id);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		
	}
	
	@GetMapping("/all-user")
	public ResponseEntity<List<Admin>>getAllUser(){
		 List<Admin> allUser = serviceImpl.getAllUser();
		return new ResponseEntity<List<Admin>>(allUser,HttpStatus.OK);
		
	}
	

	@PutMapping("update/{id}")
	public ResponseEntity<?>updateUserById(@RequestBody Admin admin ,@PathVariable int id){
		
		return serviceImpl.updateUserById(admin, id);
		
		
	}
 
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String>deleteUserById(@PathVariable int id){
		
		serviceImpl.deleteUserById(id);
		return new ResponseEntity<String>("id deleted Succefully",HttpStatus.OK);
	}
	
	
}
