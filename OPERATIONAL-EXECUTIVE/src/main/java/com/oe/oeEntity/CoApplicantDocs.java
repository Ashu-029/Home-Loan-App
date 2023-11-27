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
public class CoApplicantDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int coAppDocID;
	private byte[] addressProof;
	private byte[] adharCard;
	private byte[] panCard;
	private byte[] photo;
	private byte[] salarySlips;
	private byte[] accountStatement;
}
