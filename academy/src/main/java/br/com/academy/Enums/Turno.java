package br.com.academy.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public enum Turno {
	
	MATUTINO("matutino"),
	VESPERTINO("vespertino"),
	NOTURNO("noturno");
	
	private String turno;

}
