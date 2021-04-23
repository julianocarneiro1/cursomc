package com.julianocarneiro.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julianocarneiro.cursomc.domain.Pedido;
import com.julianocarneiro.cursomc.repositories.PedidoRepository;
import com.julianocarneiro.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired //instancia a dependencia declarada abaixo
	private PedidoRepository repo; //Serviço acessa camada de acesso a dados (Repository)
	
	//operação capaz de buscar categoria por código (recebe id Integer como parâmetro)
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	

}
