package com.julianocarneiro.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julianocarneiro.cursomc.domain.Endereco;

@Repository
// Classe responsável por acessar o BD e fazer as consultas da tabela Endereco
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	
	
}
