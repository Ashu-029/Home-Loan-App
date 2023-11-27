package com.re.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProfessionType {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private SalariedProfession SalariedProfession;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BusinessProfession BusinessProfession;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SalariedProfession getSalariedProfession() {
		return SalariedProfession;
	}

	public void setSalariedProfession(SalariedProfession salariedProfession) {
		SalariedProfession = salariedProfession;
	}

	public BusinessProfession getBusinessProfession() {
		return BusinessProfession;
	}

	public void setBusinessProfession(BusinessProfession businessProfession) {
		BusinessProfession = businessProfession;
	}
	
}
