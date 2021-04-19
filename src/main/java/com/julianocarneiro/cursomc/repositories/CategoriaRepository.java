package com.julianocarneiro.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julianocarneiro.cursomc.domain.Categoria;

@Repository
// Classe responsável por acessar o BD e fazer as consultas da tabela Categoria
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	
	
}
