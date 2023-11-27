package com.oe.oeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PropertLegal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int plId;
	private String legalDisputestatus;
	private byte[] Noc;
	private byte[] titleDeed;
	private byte[] ownershipPapers;
	private byte[] commencementCertificate;

}
