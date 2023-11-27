package com.re.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.re.entity.EnquiryInfo;
import com.re.reRepository.ReRepository;
import com.re.reService.ReService;



@Service 
public class ReServiceImple implements ReService  {

	@Autowired
	private ReRepository repository;
	
	
	@Override
	public EnquiryInfo saveUser(EnquiryInfo enqInfo) {
	
//		if (repository.existsById(enqInfo.getEnqId())) {
//			throw new ResourceAccessException("Record with ID " + enqInfo.getEnqId() + " already exists ");
//		}
//		else {
			return repository.save(enqInfo);
//		}
	}


	@Override
	public EnquiryInfo getEnqById(int enId) {
      return repository.findById(enId).orElseThrow(()-> new ResourceAccessException("Record not found"));
		
		
	}


	@Override
	public List<EnquiryInfo> getAllEnq() {
		List<EnquiryInfo> enq = repository.findAll();
		return enq;
	}
	
	public EnquiryInfo updateenq(EnquiryInfo en,int id) {
		

	      Optional<EnquiryInfo> findById = repository.findById(id);
	      if (findById.isPresent() && en.getEnqId()==id) {
			 return repository.save(findById.get());		
			 }
	      else {
			throw new ResourceAccessException("not found");
		}
	}

	

}
