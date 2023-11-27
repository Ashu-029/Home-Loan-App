package com.admin.model;

import javax.persistence.Entity;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.util.annotation.NonNull;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NonNull
	private String username;
}
