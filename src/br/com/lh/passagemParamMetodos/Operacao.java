package br.com.lh.passagemParamMetodos;

public class Operacao {

	void trocar(int x) {
		x = 20;
	}

	void alterarValor(Valor valor) {
		// se eu der um new ele já não pega o valor que tem aqui
		//valor = new Valor();
		valor.v = 20;
	}

}
