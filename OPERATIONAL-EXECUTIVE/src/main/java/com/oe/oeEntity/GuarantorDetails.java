package com.oe.oeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GuarantorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Gid")
	private int gid;
	private String gName;
	private String gDateofBirth;
	private String gRelationshipwithCustomer;
	private double gMobNo;
	private double gAdharCardNo;
	private String gMortgageDetails;
	private String gloaclAddress;
	private String gPermanentAddress;

}
