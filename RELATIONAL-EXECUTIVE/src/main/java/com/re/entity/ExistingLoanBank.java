package com.re.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExistingLoanBank {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int exlBranchId;
	private String exlBranchName;
	private double exlBranchCode;
	private String exlBranchType;
	private String exlIFSCcode;
	private String exlMICRcode;
	private double exlConatctNO;
	
	private String bankbCity;
	private int    bankPincode;
	private String bState;
	
	private String exlEmail;
	private String exlstatus;

}
