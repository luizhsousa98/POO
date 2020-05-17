package br.com.lh.passagemParamMetodos;

public class Aplicacao {

	public static void main(String[] args) {
		Operacao o = new Operacao();

		int x = 10;
		// Passagem por cópia não pega o valor que está lá dentro do método
		o.trocar(x);
		System.out.println(x);

		// Pega o valor que está dentro do método operacao
		Valor valor = new Valor();
		valor.v = 10;
		o.alterarValor(valor);
		System.out.println(valor.v);

	}

}
