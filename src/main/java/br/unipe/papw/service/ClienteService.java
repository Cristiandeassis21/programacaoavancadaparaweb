package br.unipe.papw.service;

import java.util.List;

import br.unipe.papw.model.Cliente;

public interface ClienteService {
	
	void save(Cliente cliente);
	Cliente findByNome(String nome);
	List<Cliente> findAll();
	

}
