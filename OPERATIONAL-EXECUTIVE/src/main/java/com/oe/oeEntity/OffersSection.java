package com.oe.oeEntity;

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
	private long offerAmount;// 25,00,000
	private float offerRoi; // 8.5
	private int offerProcessingFees;// 0
	private int offerTenure;// 30 years

}
