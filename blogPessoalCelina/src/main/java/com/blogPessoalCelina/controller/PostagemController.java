package com.blogPessoalCelina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogPessoalCelina.model.Postagem;
import com.blogPessoalCelina.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens") /*mapeia as solicitações via URL*/
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;

    @GetMapping /*mapeia todas as requests GET*/
	public ResponseEntity<List<Postagem>> getAll(){	 
    	return ResponseEntity.ok(postagemRepository.findAll());
 }
    
}
