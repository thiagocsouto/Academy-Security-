package br.com.academy.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public enum Curso {
	
	ADMINISTRACAO("administração"),
	INFORMATICA("informatica"),
	CONTABILIDADE("contabilidade"),
	PROGRAMACAO("progração"),
	ENFERMAGEM("enfermagem");
	
	private String curso;
	
} 
