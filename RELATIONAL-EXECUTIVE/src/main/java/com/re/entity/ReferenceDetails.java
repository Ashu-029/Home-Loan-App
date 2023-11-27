package com.re.entity;

	

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ReferenceDetails {

	@Id
	private int referId;
	private String referName;
	private long referMobileNo;
	private String referCustProfession;

	
	
}
