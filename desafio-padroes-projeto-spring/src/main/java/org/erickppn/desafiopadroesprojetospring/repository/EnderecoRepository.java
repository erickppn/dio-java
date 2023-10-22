package org.erickppn.desafiopadroesprojetospring.repository;

import org.erickppn.desafiopadroesprojetospring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}