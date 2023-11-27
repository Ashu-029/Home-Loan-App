package com.re.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String custName;
	private String custDOB;
	private int custAge;
	private String custEmail;
	private long custMobNo;
	private long custAltMobNo;
	private long custSelfFundingforHome;
	private long custLoanAmtRequired;	



	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress cAddress;

	
	@OneToMany(cascade = CascadeType.ALL)
    private List<AllDocuments> alldocs;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ProfessionType custProfession;


	@OneToOne(cascade = CascadeType.ALL)
	private CoApplicantDetails cCoApplicantDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails cGuarantorDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cCibil;

	
	@OneToOne(cascade = CascadeType.ALL)
	private ExistingLoan cExisitngLoan;


//	@OneToOne(cascade = CascadeType.ALL)
//	private AccountDetails custAccountDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInfo cPropertyInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private ReferenceDetails reference;

//	@OneToOne(cascade = CascadeType.ALL)
//	private CustomerAddress cAddress;

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public long getCustMobNo() {
		return custMobNo;
	}
	public void setCustMobNo(long custMobNo) {
		this.custMobNo = custMobNo;
	}
	public long getCustAltMobNo() {
		return custAltMobNo;
	}
	public void setCustAltMobNo(long custAltMobNo) {
		this.custAltMobNo = custAltMobNo;
	}
	public long getCustSelfFundingforHome() {
		return custSelfFundingforHome;
	}
	public void setCustSelfFundingforHome(long custSelfFundingforHome) {
		this.custSelfFundingforHome = custSelfFundingforHome;
	}
	public long getCustLoanAmtRequired() {
		return custLoanAmtRequired;
	}
	public void setCustLoanAmtRequired(long custLoanAmtRequired) {
		this.custLoanAmtRequired = custLoanAmtRequired;
	}
	public ProfessionType getCustProfession() {
		return custProfession;
	}
	public void setCustProfession(ProfessionType custProfession) {
		this.custProfession = custProfession;
	}
	public CoApplicantDetails getcCoApplicantDetails() {
		return cCoApplicantDetails;
	}
	public void setcCoApplicantDetails(CoApplicantDetails cCoApplicantDetails) {
		this.cCoApplicantDetails = cCoApplicantDetails;
	}
	public AccountDetails getCustAccountDetails() {
		return custAccountDetails;
	}
	public void setCustAccountDetails(AccountDetails custAccountDetails) {
		this.custAccountDetails = custAccountDetails;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	private OffersSection offersec;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private ProfessionType custProfession;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	private CoApplicantDetails cCoApplicantDetails;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	private GuarantorDetails cGuarantorDetails;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	private Cibil cCibil;
//

////
//	@OneToOne(cascade = CascadeType.ALL)
//	private ExistingLoan cExisitngLoan;
//
//
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails custAccountDetails;

//	@OneToOne(cascade = CascadeType.ALL)
//	private PropertyInfo cPropertyInfo;

}
