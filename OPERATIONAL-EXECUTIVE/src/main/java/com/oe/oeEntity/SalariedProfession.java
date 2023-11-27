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
public class SalariedProfession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private double pSalary;
	private String psalaryType;
	private String pVintage;
	private String pDesignation;
}
