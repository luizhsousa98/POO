package br.com.lh.passagemParamMetodos;

public class Aplicacao {

	public static void main(String[] args) {
		Operacao o = new Operacao();

		int x = 10;
		// Passagem por c�pia n�o pega o valor que est� l� dentro do m�todo
		o.trocar(x);
		System.out.println(x);

		// Pega o valor que est� dentro do m�todo operacao
		Valor valor = new Valor();
		valor.v = 10;
		o.alterarValor(valor);
		System.out.println(valor.v);

	}

}
