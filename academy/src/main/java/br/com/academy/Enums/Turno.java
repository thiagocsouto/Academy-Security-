package br.com.academy.Enums;

public enum Turno {
	
	MATUTINO("matutino"),
	VESPERTINO("vespertino"),
	NOTURNO("noturno");
	
	private String turno;
	
	private Turno (String turno) {
		this.turno = turno;
	}

}
