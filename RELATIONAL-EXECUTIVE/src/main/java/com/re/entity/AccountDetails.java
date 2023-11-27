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
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
	private String accBankName;
	private Double accNO;
	private String accHolderName;
	private String accType;
	private String accStatus;
	private String accBranchName;
	private String accBranchifscCode;




	

}
