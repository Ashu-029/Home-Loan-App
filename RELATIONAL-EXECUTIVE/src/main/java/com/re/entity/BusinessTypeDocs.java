package com.re.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Setter
@Getter
@Entity

@Data


@NoArgsConstructor
@AllArgsConstructor
public class BusinessTypeDocs extends AllDocuments{



//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//    private int documentID;
	@Lob

	
	private byte[] GST;
}
