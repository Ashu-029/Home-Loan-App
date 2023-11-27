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
public class BankAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bAddId;
	private String bLandmark;
	private String bAreaname;
	private String bCity;
	private int bPincode;
	private String bState;
}
