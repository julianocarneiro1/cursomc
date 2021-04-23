package com.julianocarneiro.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julianocarneiro.cursomc.domain.Categoria;
import com.julianocarneiro.cursomc.repositories.CategoriaRepository;
import com.julianocarneiro.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired // instancia a dependencia declarada abaixo
	private CategoriaRepository repo;
	
	// operação capaz de buscar categoria por código
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	// metodos CRUD que serão chamados pelo CategoriaResource
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId()); // reaproveitando método para ver se id existe
		return repo.save(obj);
	}

}
