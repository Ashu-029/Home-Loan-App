package com.re.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PropertLegal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "PropertyLegal_seq")
	@SequenceGenerator(initialValue = 1,allocationSize = 1, name = "PropertyLegal_seq")
	private int plId;
	private String legalDisputestatus; // no
	@Lob
	private byte[] Noc;// r8
	@Lob
	private byte[] titleDeed;// r8
	@Lob
	private byte[] ownershipPapers;// 
	@Lob
	private byte[] commencementCertificate;
	
	
}
