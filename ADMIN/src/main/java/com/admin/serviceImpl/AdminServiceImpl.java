package com.admin.serviceImpl;

import java.util.List;	
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.admin.exception.DuplicateKeyException;
import com.admin.exception.ResourceNotFoundException;
import com.admin.model.Admin;
import com.admin.repo.AdminRepository;
import com.admin.service.AdminService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

	private final AdminRepository adminRepository;

	@Override
	public Admin saveUser(Admin admin) {
		// if id is not zero and admin id is exist then throw exception
		if (admin.getId() != 0 && adminRepository.existsById(admin.getId())) {
			throw new DuplicateKeyException("Either Record with ID " + admin.getId() + " already exists or Could not be null");
		}

		return adminRepository.save(admin);

	}

	public Admin getUserById(int id) {
		return adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("user with given id not found !!!"));

	}

	
	public List<Admin> getAllUser() {

		List<Admin> allUsers = adminRepository.findAll();
		if (allUsers.isEmpty()) {
			throw new ResourceNotFoundException("UserList is Empty");
		}
		return allUsers;
	}

	

	public ResponseEntity<?> updateUserById(Admin admin, @NonNull Integer id) {

		if (!id.equals(admin.getId()) || !adminRepository.existsById(id)) {
			return new ResponseEntity<>("The provided ID does not match any existing records or is not valid",
					HttpStatus.BAD_REQUEST);
		}
		Admin updatedAdmin = adminRepository.save(admin);

		return new ResponseEntity<Admin>(updatedAdmin, HttpStatus.OK);
	}

	
	
	
	public void deleteUserById(int id) {
	    Optional<Admin> adminOptional = adminRepository.findById(id);
//using Optional<Admin> will return data associated with particular id or perform any operation related to that id
	    if (adminOptional.isPresent()) {
	        Admin admin = adminOptional.get();
	        if (id == admin.getId()) {
	            adminRepository.deleteById(id);
	        } 
	        else {
	            throw new ResourceNotFoundException("The provided ID does not match the existing record");
	        }
	    } 
	    else {
	        throw new ResourceNotFoundException("No record found with the provided ID");
	    }
	}
}
