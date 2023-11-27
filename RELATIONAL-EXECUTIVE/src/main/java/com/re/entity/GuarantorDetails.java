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
public class GuarantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guaId;
	private String guaName;
	private String guaDOB;
	private String guaRelationshipwithCustomer;
	private double guaMobileNo;
	private double guaAadharCardNo;
	private String guaMortgauageDetails;
	private String guaLocalDetails;
	private String guaPermanentDetails;

}
