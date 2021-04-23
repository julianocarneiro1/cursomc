package com.julianocarneiro.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julianocarneiro.cursomc.domain.Cliente;
import com.julianocarneiro.cursomc.repositories.ClienteRepository;
import com.julianocarneiro.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired //instancia a dependencia declarada abaixo
	private ClienteRepository repo; //Serviço acessa camada de acesso a dados (Repository)
	
	//operação capaz de buscar categoria por código (recebe id Integer como parâmetro)
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	

}
