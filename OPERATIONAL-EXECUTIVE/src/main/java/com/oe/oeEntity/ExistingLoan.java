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
public class ExistingLoan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int exLoanId;
	private double exLoanAmount;
	private int exTenure;
	private double exPaidLoanAmount;
	private double exOutstandingLoanAmount;
	private int exDeafulterCount;

	@OneToOne(cascade = CascadeType.ALL)
	private ExistingLoanBank exlBankDetails;

	private String status;
	private String remark;

}
