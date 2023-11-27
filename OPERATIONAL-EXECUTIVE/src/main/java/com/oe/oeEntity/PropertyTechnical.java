package com.oe.oeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PropertyTechnical {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ptId;
	private String pPhysicalHealthStatus;
	private int pMarketValue;
	private String constructionArea;
	private int constructionPrice;

}
