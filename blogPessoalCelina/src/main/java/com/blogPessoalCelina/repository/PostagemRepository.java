package com.blogPessoalCelina.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.blogPessoalCelina.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{  /* o 1º param é o que será mapeado dentro do DB, ou seja, a entidade(tb_postagens)*/
	
	                                                                      /*o Long representa o atributo que recebeu a anotação @Id, ou seja, a PK*/ 
}
