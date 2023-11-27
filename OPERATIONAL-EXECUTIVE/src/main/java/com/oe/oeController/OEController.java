package com.oe.oeController;

import javax.ws.rs.Path;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.oe.oeEntity.EnquiryInfo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/OE")
@Slf4j
@Builder
public class OEController {

	@Autowired
	private WebClient client;
	
	@GetMapping("/{enId}")
	@CircuitBreaker(name="RelationalExeBreaker",fallbackMethod = "RelationalExeFallBack")
	@Retry(name="RelationalExeBreaker",fallbackMethod = "RelationalExeFallBack")
	public ResponseEntity<EnquiryInfo> getEnquiryById(@PathVariable int enId){
		
		EnquiryInfo enquiry = client.get()
	          .uri("http://localhost:9098/v1/RE/get-enquiry/"+enId )
	          .retrieve()
	          .bodyToMono(EnquiryInfo.class)
	          .block();
		return new ResponseEntity<EnquiryInfo>(enquiry,HttpStatus.OK);
	}
	
	//creating fallback method for circuitbreaker with same return type
	
	public ResponseEntity<EnquiryInfo>RelationalExeFallBack(int enId,Exception ex){
		int retry=1;
		log.info("Retry count: {}",retry);
		
		retry++;
		String s="Oops! Something went wrong, please order after some time!";
		EnquiryInfo n= new EnquiryInfo();
		n.setCustEmail(s);
		log.info("Oops! Something went wrong, please order after some time!",ex.getMessage());
		
		return new ResponseEntity<EnquiryInfo>(n,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
