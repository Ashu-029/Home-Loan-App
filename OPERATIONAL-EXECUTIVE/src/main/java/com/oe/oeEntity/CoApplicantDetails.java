package com.oe.oeEntity;

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
public class CoApplicantDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int coa_Id;
	private String coa_Name;
	private String coa_DOB;
	private int coa_Age;
	private String coa_Email;
	private long coa_MobileNo;
	private long coa_altrnateMobileNo;
	private String coa_RelationshipWithCustomer;

}
