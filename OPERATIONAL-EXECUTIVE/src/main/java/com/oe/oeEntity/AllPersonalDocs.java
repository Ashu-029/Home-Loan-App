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
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AllPersonalDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	private SalariedTypeDocs salDocs;

	@OneToOne(cascade = CascadeType.ALL)
	private BusinessTypeDocs busDocs;

}
