package com.example.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alunos")
public class Aluno {
	
	@Id
	@Column(name="matricula", unique = true)
	@JsonProperty
	private Long matricula;
	
	@Column(name = "nome")
	@JsonProperty
	private String nome;
	
	@Column(name = "email", unique = true)
	@JsonProperty
	private String email;
	
	@ManyToOne
	@JoinColumn(name="turma_id")
	@JsonProperty
	private Turma turma;
	
	public Aluno() {}
	
}
