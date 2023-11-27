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
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cName;
	private String cDOB;
	private int cAge;
	private String cEmail;
	private long cMobileNo;
	private long cAtrnateMobileNo;
	private long cSelfFundingforHome;
	private long cLoanAmtRequired;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress cAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocs cAllPersonalDocs;

	@OneToOne(cascade = CascadeType.ALL)
	private ProfessionType cProfession;

	@OneToOne(cascade = CascadeType.ALL)
	private CoApplicantDetails cCoApplicantDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails cGuarantorDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cCibil;

	@OneToOne(cascade = CascadeType.ALL)
	private LoanApplication cLoanApplication;

	@OneToOne(cascade = CascadeType.ALL)
	private ExistingLoan cExisitngLoan;

	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails cAccountDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInfo cPropertyInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private OffersSection offersec;

}
