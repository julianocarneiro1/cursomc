package com.julianocarneiro.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julianocarneiro.cursomc.domain.Categoria;
import com.julianocarneiro.cursomc.repositories.CategoriaRepository;
import com.julianocarneiro.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired //instancia a dependencia declarada abaixo
	private CategoriaRepository repo; //Serviço acessa camada de acesso a dados (Repository)
	
	//operação capaz de buscar categoria por código (recebe id Integer como parâmetro)
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	//metodo que será chamado pelo CategoriaResource
	public Categoria insert(Categoria obj) {
		obj.setId(null); //deve ser um id nulo para inserir e não modificar
		return repo.save(obj);
	}

}
