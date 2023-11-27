package com.re.reService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.re.entity.EnquiryInfo;

public interface ReService {

	

	EnquiryInfo saveUser(EnquiryInfo enqInfo);

	EnquiryInfo getEnqById(int enId);

	List<EnquiryInfo> getAllEnq();

}
