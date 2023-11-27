package com.oe.oeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EMICalculationDTO {

	private double loanAmount;
	private double interestRate;
	private int tenure;
}