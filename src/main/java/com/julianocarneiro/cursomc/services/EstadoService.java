package com.julianocarneiro.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julianocarneiro.cursomc.domain.Estado;
import com.julianocarneiro.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	public EstadoRepository repo;
	
	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}	

}
