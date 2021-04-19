package com.julianocarneiro.cursomc.domain;

import java.io.Serializable;

// Serializable significa que os objetos dessa Classe poderão ser convertidos para uma sequencia de bytes (p/ gravação em arquivos, tráfego em rede, procedimento padrão)
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// por padrão, todos os atributos são privados, porém pode-se criar os Getters and Setters
	private Integer id;
	private String nome;

	// contrutor vazio para instanciar objetos sem jogar nada para os atributos
	public Categoria() {
	}

	// construtor com atributos
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	
	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//criação dos hashCode equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}