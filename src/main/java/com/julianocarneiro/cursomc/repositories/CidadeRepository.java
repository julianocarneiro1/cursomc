package com.julianocarneiro.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julianocarneiro.cursomc.domain.Cidade;

@Repository
// Classe responsável por acessar o BD e fazer as consultas da tabela Cidade
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	
	
}
