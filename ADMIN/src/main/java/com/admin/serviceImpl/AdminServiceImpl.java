package com.admin.serviceImpl;

import org.springframework.stereotype.Service;

import com.admin.model.Admin;
import com.admin.repo.AdminRepository;
import com.admin.service.AdminService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

	private final AdminRepository adminRepository;
	
	@Override
	public Admin saveUser(Admin admin) {

		return adminRepository.save(admin);
	}

}
