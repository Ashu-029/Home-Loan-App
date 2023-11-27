package com.oe.oeEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cibil {

	@Id
	private int cibilId;
	private int cibilScore;
	private String status;
	private String remark;

}
