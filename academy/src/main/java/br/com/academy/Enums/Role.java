package br.com.academy.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public enum Role {
	
	ADMIN("ADMIN"),
	USER("USER");
	
	private String nome;

}
