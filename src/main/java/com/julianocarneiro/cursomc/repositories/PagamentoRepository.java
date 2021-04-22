package com.julianocarneiro.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julianocarneiro.cursomc.domain.Pagamento;

@Repository
// Classe responsável por acessar o BD e fazer as consultas da tabela Pagamento
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

	
	
}
