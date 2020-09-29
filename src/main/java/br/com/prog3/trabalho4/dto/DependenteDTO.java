package br.com.prog3.trabalho4.dto;

import br.com.prog3.trabalho4.domain.Dependente;

public class DependenteDTO {
	private Long id;
	private String cpfEmpregado;
	private String nome;
	private String grauParentesco;
	private String dataNascimento;
	
	
	public DependenteDTO(Dependente dependente) {
		this.id = dependente.getId();
		this.cpfEmpregado = dependente.getCpfEmpregado();
		this.nome = dependente.getNome();
		this.grauParentesco = dependente.getGrauParentesco();
		this.dataNascimento = dependente.getDataNascimento();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCpfEmpregado() {
		return cpfEmpregado;
	}


	public void setCpfEmpregado(String cpfEmpregado) {
		this.cpfEmpregado = cpfEmpregado;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGrauParentesco() {
		return grauParentesco;
	}


	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	

}
