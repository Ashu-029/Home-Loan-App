package com.re.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.re.entity.EnquiryInfo;
import com.re.reService.ReService;
import com.re.serviceImpl.ReServiceImple;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/RE")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200/")
public class ReController {

	
	@Autowired
	private ReServiceImple res;
	
	@PostMapping("/save-user")
	public ResponseEntity<EnquiryInfo>saveEnquiry(@RequestBody EnquiryInfo eInfo){
		EnquiryInfo enquiry = res.saveUser(eInfo);
		
		return new ResponseEntity<EnquiryInfo>(enquiry,HttpStatus.CREATED);
	}
	
	@GetMapping("/get-enquiry/{enId}")
	public ResponseEntity<EnquiryInfo>getEnquiryById(@PathVariable int enId){
		log.info("in oecontroller");
		EnquiryInfo enqById = res.getEnqById(enId);
		
		return new ResponseEntity<EnquiryInfo>(enqById,HttpStatus.OK);
	}
	
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<EnquiryInfo>>getAllEnquiry(){
		List<EnquiryInfo> allEnq = res.getAllEnq();
		return new ResponseEntity<List<EnquiryInfo>>(allEnq,HttpStatus.OK);
	}
	
	
	@PutMapping("/update-data/{id}")
	public ResponseEntity<EnquiryInfo> updateEnq(@RequestBody EnquiryInfo enquiry, @PathVariable int id ){
		
		EnquiryInfo updateenq = res.updateenq(enquiry, id);
		
		return new ResponseEntity<EnquiryInfo>(updateenq,HttpStatus.OK);
	}
	
	
	
	
	
}
