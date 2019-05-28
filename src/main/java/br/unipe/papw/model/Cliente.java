package br.unipe.papw.model;

import javax.persistence.Entity;

@Entity
public class Cliente {
	
	private int cpf;
	private String nome;
	
	/**
	 * @return o cpf
	 */
	public int getCpf() {
		return cpf;
	}
	
	/**
	 * @param cpf o cpf a mandar
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * @return o nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome o nome a mandar
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	

}
