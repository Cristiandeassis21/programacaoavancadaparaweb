package br.unipe.papw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.unipe.papw.model.Cliente;
import br.unipe.papw.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	private ClienteRepository clienteRepository;
	
	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	
	public Cliente findByNome(String nome) {
		return clienteRepository.findByNome(nome);
	}

	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}
