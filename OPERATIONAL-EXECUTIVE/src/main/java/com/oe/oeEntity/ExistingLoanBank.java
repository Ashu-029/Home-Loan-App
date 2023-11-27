package com.oe.oeEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

	@OneToOne(cascade = CascadeType.ALL)
	private BankAddress exlBranchAddress;

	private String exlEmail;
	private String exlstatus;

}
