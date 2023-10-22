package org.erickppn.desafiopadroesprojetospring.repository;

import org.erickppn.desafiopadroesprojetospring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}