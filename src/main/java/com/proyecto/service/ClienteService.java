package com.proyecto.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.Cliente;
import com.proyecto.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cRepository;
	
	public ArrayList<Cliente> getAllClientes(){
		return (ArrayList<Cliente>) cRepository.findAll();
	}
	
	public Optional<Cliente> findById(int id){
		return cRepository.findById(id);
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return cRepository.save(cliente);
	}
}
