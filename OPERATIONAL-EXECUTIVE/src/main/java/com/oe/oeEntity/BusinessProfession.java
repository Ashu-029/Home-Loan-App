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
public class BusinessProfession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private double pBIncome;
	private String pBVintage;
	private String pBStatus;
	private String pBSegment;

}
