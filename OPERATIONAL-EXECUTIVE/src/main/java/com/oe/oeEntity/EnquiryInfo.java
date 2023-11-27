package com.oe.oeEntity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EnquiryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enqId;
	private String custName;
	private String custDOB;
	private int custAge;
	private String custEmail;
	private long custMobileNo;
	private int custSalary;
	private int homeLoanAmount;
	private String custCompanyName;
	private String custCity;
	private int custPincode;
	private long custAdharCardNo;
	private String custPanCardNo;
	
	

	 
}
