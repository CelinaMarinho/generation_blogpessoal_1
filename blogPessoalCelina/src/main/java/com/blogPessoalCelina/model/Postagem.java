package com.blogPessoalCelina.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

/*import com.fasterxml.jackson.annotation.JsonIgnoreProperties;*/

@Entity /*indica que a classe define uma entidade e esta será usada para gerar uma table no DB*/
@Table(name = "tb_postagens") /*anotation para indicar o nome da tabela*/
public class Postagem {

	@Id /*faz com que seja a pk da table*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*faz o mesmo que o auto_increment do MySQL*/
	private Long id;
	
	@NotBlank (message = "O título não pode ser vazio")
	@Size(min=5, max=100, message = "Por favor, digite entre 5 e 100 caracteres")
	private String titulo;
		
	@NotBlank(message = "Por favor, digite um texto")
	@Size(min=10, max=1000, message = "Por favor, digite entre 10 e 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}	
	
}
