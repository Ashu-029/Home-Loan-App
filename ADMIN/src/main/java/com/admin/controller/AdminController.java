package com.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	@PostMapping
	public ResponseEntity<Admin>addUser(@RequestBody Admin admin){
		
		Admin user = serviceImpl.saveUser(admin);
		
		return new ResponseEntity<Admin>(user, HttpStatus.CREATED);
		
	}
}
