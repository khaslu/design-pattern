package br.com.khaslu.dp;

public class Divisao implements Expressao {

	private final Expressao expressao1;
	private final Expressao expressao2;

	public Divisao(final Expressao expressao1, final Expressao expressao2) {
		this.expressao1 = expressao1;
		this.expressao2 = expressao2;
	}

	@Override
	public Double calcular() {
		return this.expressao1.calcular() / this.expressao2.calcular();
	}

}
