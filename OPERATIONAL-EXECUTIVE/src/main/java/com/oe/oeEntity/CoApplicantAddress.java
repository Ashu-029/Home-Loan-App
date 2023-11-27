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
@AllArgsConstructor
@NoArgsConstructor
public class CoApplicantAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String coaLoaclAddress;
	private String coaPermanentAddress;
}
