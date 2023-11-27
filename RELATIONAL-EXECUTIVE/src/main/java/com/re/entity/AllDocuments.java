package com.re.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table

public class AllDocuments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docId;

	@Lob
	private byte[] addressProof;
	@Lob
	private byte[] itr;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] accountStatement;
	



}
