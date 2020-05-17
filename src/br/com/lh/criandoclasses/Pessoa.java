package br.com.lh.criandoclasses;

/**
 * 
 * @author lhsousa
 * @data 18/12/2018
 * 
 *       Classe: É um tipo Objeto, por exemplo livro é um Objeto, classe é o
 *       conteúdo todo.
 * 
 *       Atributos: São descrições, por exemplo todo livro tem um nome, título,
 *       descricao, isbn...
 * 
 *       Métodos: São as ações, por exemplo um livro tem um capítulo e cada
 *       capítulo é diferente então tenho de criar métodos para fazer as ações
 *       de conteúdo de cada capítulo.
 * 
 */
public class Pessoa {

	String nome;
	int numFigurinhas;

	// void não tem retorno
	void receberFigurinhas(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}

	void dar(int numFigurinhas, Pessoa p) {
		// dar as figurinhas
		this.numFigurinhas -= numFigurinhas;
		// recebe as figurinhas
		p.receberFigurinhas(numFigurinhas);
	}

}
