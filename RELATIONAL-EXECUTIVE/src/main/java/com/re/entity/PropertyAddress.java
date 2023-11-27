package com.re.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PropertyAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "PropertyAddress_seq")
	@SequenceGenerator(initialValue = 1,allocationSize = 1, name = "PropertyAddress_seq")
	private int adId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private double pincode;
	private String streetname;

}
