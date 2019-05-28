package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.papw.model.Cliente;

@Repository
public interface ClienteRepository
	   extends JpaRepository<Cliente, Long>{
	
	Cliente findByNome(String nome);

}
