package br.com.lh.criandoclasses;

/**
 * 
 * @author lhsousa
 * @data 18/12/2018
 * 
 *       Classe: � um tipo Objeto, por exemplo livro � um Objeto, classe � o
 *       conte�do todo.
 * 
 *       Atributos: S�o descri��es, por exemplo todo livro tem um nome, t�tulo,
 *       descricao, isbn...
 * 
 *       M�todos: S�o as a��es, por exemplo um livro tem um cap�tulo e cada
 *       cap�tulo � diferente ent�o tenho de criar m�todos para fazer as a��es
 *       de conte�do de cada cap�tulo.
 * 
 */
public class Pessoa {

	String nome;
	int numFigurinhas;

	// void n�o tem retorno
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
