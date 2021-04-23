package com.julianocarneiro.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julianocarneiro.cursomc.domain.Pedido;
import com.julianocarneiro.cursomc.services.PedidoService;


//Criando classe que será um controlador REST e responderá pelo endpoint "/categorias"
@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired //Controlador REST acessa camada de Serviço
	private PedidoService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
