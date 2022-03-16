package com.generation.petshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.petshop.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

	public List <Produto> findByMarcaContainingIgnoreCase(String marca);
	
	public List <Produto> findByNomeOrMarca(String nome, String marca);
}
