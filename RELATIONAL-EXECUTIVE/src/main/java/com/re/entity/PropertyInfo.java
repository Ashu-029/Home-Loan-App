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
public class PropertyInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;
	private String propertyType;
    private String propertyArea;
	private double propertyPrice;
	private String projectName; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertLegal propertyLegal;

	@OneToOne(cascade = CascadeType.ALL)
	private PropertyTechnical  propertyTechnical;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyAddress propertyAddress;
	
}


