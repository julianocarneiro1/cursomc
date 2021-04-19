package com.julianocarneiro.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julianocarneiro.cursomc.domain.Categoria;
import com.julianocarneiro.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //instancia a dependencia declarada abaixo
	private CategoriaRepository repo; //Serviço acessa camada de acesso a dados (Repository)
	
	//operação capaz de buscar categoria por código (recebe id Integer como parâmetro)
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	

}
