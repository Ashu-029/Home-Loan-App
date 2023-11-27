package com.oe.oeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BusinessTypeDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentID;
	private byte[] addressProof;
	private byte[] itr;
	private byte[] adharCard;
	private byte[] panCard;
	private byte[] photo;
	private byte[] signature;
	private byte[] bankCheque;
	private byte[] GST;
	private byte[] accountStatement;
}
