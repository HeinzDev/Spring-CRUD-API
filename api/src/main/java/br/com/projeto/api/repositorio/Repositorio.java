package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Cliente;

//Arquivo para ações SQL
//no <> contem objeto a ser manipulado e o segundo é tipo do ID(classe Long)
@Repository
public interface Repositorio extends CrudRepository<Cliente, Long>{
    
}
    