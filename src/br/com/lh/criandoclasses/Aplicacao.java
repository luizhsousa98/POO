package br.com.lh.criandoclasses;

public class Aplicacao {

	public static void main(String[] args) {

		/**
		 * Quando eu dou um new são instancias que referenciam objetos diferentes,
		 * instâncias elas aponta para um objeto como acesso a determinado Objeto.
		 */
		Pessoa p1 = new Pessoa();
		p1.nome = "Luiz";
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p1.receberFigurinhas(3);		
		p1.dar(2, p2);
		p2.dar(3, p1);
		p2.receberFigurinhas(4);
		
		System.out.println(p1.nome + " => " + p1.numFigurinhas);
		System.out.println(p2.nome + " => " + p2.numFigurinhas);
		

	}

}
