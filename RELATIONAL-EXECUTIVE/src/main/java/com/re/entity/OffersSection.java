package com.re.entity;

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
public class OffersSection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int offerID;
	private long offerAmount;
	private float offerRoi;
	private int offerProcessingFees;
	private int offerTenure;
	

	private int id;
	private String landmark;
	private String areaname;
	private String city;
	private int    pincode;
	private String state;
}
