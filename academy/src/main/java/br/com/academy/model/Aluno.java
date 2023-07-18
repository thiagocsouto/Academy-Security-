package br.com.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;
import br.com.academy.Enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString @Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
@Table(name="aluno")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nome")
	@Size(min=3, max=50, message="O nome deverá conter entre 3 e 50 caracteres para continuar.")
	@Pattern(regexp = "^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÒÖÚÇÑ ]*$", message="O nome não deve começar com uma letra minúscula, número ou caractere especial.")
	private String nome;
	
	@Column(name="curso")
	@Enumerated(EnumType.STRING)
	@NotNull(message="Selecione um curso para continuar")
	private Curso curso;
	
	@Column(name="matricula")
	@Size(min=6, max=20, message="Matrícula deve ter começar com A, tendo 6 números no mínimos. Aperte no botão GERAR.")
	@Pattern(regexp = "^[A][0-9]*$", message="Matrícula inválida.")
	private String matricula;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	@NotNull(message="O status precisa ser selecionado para continuar")
	private Status status;
	
	@Column(name="turno")
	@Enumerated(EnumType.STRING)
	@NotNull(message="Selecione um turno para continuar")
	private Turno turno;

}
