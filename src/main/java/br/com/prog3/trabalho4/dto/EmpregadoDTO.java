package br.com.prog3.trabalho4.dto;

import br.com.prog3.trabalho4.domain.Empregado;

public class EmpregadoDTO {
	private Long id;
	private int cpf;
	private String nome;
	private Integer idade;
	private double salario;

	public EmpregadoDTO(Empregado empregado) {
		this.id = empregado.getId();
		this.nome = empregado.getNome();
		this.idade = empregado.getIdade();
		this.salario = empregado.getSalario();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
