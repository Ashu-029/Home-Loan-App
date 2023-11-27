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
public class SalariedTypeDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salTDId;
	private byte[] addressProof;
	private byte[] itr;
	private byte[] adharCard;
	private byte[] panCard;
	private byte[] photo;
	private byte[] signature;
	private byte[] bankCheque;
	private byte[] salarySlips;
	private byte[] accountStatement;
}
