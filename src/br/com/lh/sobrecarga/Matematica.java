package br.com.lh.sobrecarga;

/**
 * 
 * @author lhsousa Sobrecarga de m�todos m�todos com nomes iguais mas com
 *         par�metros diferentes. Encapsulamento get mostra valor, set insere
 *         valor.
 */
public class Matematica {

	int soma(int a, int b) {
		System.out.println("Soma: a + b");
		return a + b;
	}

	int soma(int a, int b, int c) {
		System.out.println("Soma: a + b + c");
		return a + b + c;
	}

	double soma(double a, double b) {
		System.out.println("Soma de n�meros decimais");
		return a + b;
	}

}
