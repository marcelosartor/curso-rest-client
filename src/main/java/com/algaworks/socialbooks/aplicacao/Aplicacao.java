
package com.algaworks.socialbooks.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import com.algaworks.socialbooks.client.LivrosClient;
import com.algaworks.socialbooks.client.domain.Livro;

public class Aplicacao {

	
	
	public static void main(String[] args) throws ParseException {
		
		LivrosClient cliente = new LivrosClient("http://localhost:8083","algaworks","123456");
		
		//Listar Livros
		List<Livro> listaLivros = cliente.listar(); 
				
		for(Livro livro : listaLivros){
			System.out.printf("\nLivro : %s data %s",livro.getNome(),livro.getPublicacao());
		}
		
		//Criar Livro
		Livro livro = new Livro();
		livro.setNome("Git passo a passo");
		livro.setEditora("Algaworks");
		//SimpleDateFormat publicacao = new SimpleDateFormat("dd/MM/yyyy");
		//livro.setPublicacao(publicacao.parse("05/02/2017"));
		livro.setPublicacao(LocalDate.now());
		livro.setResumo("teste de resumo");
		
		String localizacao = cliente.salvar(livro);
		System.out.println("\n"+localizacao);
		
		//Buscar um livro
		Livro livroBuscado = cliente.buscar(localizacao);
		System.out.println("Livro : "+livro.getNome());
		
	}
	
	
	

}
