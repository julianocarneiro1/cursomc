package com.julianocarneiro.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julianocarneiro.cursomc.domain.Cliente;
import com.julianocarneiro.cursomc.services.ClienteService;


//Criando classe que será um controlador REST e responderá pelo endpoint "/categorias"
@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired //Controlador REST acessa camada de Serviço
	private ClienteService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		
		Cliente obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
