package br.com.lh.sobrecarga;

public class Aplicacao {

	public static void main(String[] args) {

		Matematica m = new Matematica();

		int soma = m.soma(10, 10);
		System.out.println(soma + "\n");

		int somar = m.soma(10, 15, 20);
		System.out.println(somar + "\n");

		double somando = m.soma(20.5, 45.3);
		System.out.println(somando + "\n");

	}

}
