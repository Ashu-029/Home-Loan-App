package com.oe.oeEntity;

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
	private int pid;
	@OneToOne(cascade = CascadeType.ALL)
	private SalariedProfession SalariedProfession;
	@OneToOne(cascade = CascadeType.ALL)
	private BusinessProfession BusinessProfession;
}
