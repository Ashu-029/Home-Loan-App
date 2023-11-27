package com.oe.oeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int customerId;

	private int propertyId;

	private double loanAmount;

	private double interestRate;

	private int tenure;

	private String status; // Pending, In Review, Approved, Rejected, Disbursed, Closed, Default.

	private String dateSubmitted;

	private String dateApproved;

	private Long loanOfficerId;

	private int creditScore;

	private double monthlyPayment;

	private double EMI;

	private String loanType;
}
