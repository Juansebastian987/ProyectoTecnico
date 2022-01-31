package com.proyecto.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.model.Cliente;
import com.proyecto.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService cService;
	
	@GetMapping("/")
	public String getHome(){
		return "Back-End API MiHotel";
	}
	
	@GetMapping("/clientes")
	public ArrayList<Cliente> getAllClientes(){
		return cService.getAllClientes();
	}
	
	@GetMapping("/clientes/{id}")
	public Optional<Cliente> getClienteById(@PathVariable int id) {
		return cService.findById(id);
	}
	
	@PostMapping("/cliente")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return cService.saveCliente(cliente);
	}
	
}
