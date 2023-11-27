package com.re.entity;

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
public class APFDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int APFId;
	private String APFBuilderName;
	private char APFBuilderCategory;
	
	
	private int id;
	private String landmark;
	private String areaname;
	private String city;
	private int    pincode;
	private String state;
}
