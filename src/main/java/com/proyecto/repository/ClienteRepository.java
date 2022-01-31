package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer>{

}
