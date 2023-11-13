package com.genesis.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.genesis.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
	
}
