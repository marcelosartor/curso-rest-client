package com.algaworks.socialbooks.client.domain;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class Livro {

	private Long id;
	private String nome;
	
	//@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	//@JsonDeserialize(using = LocalDateDeserializer.class)
	//@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate publicacao;
	/*
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	private Date publicacao;
	*/
	private String editora;
	private String resumo;
	private List<Comentario> comentarios;
	private Autor autor;
	
	
	public Livro() {
		super();
	}

	public Livro(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	

	
	public LocalDate getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(LocalDate publicacao) {
		this.publicacao = publicacao;
	}

/*
	public Date getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}

*/	
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
	
}
