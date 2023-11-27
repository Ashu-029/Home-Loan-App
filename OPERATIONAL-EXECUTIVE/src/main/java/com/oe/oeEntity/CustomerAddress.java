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
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressid;

	@OneToOne(cascade = CascadeType.ALL)
	private Permanent permanent;

	@OneToOne(cascade = CascadeType.ALL)
	private Local local;

}
