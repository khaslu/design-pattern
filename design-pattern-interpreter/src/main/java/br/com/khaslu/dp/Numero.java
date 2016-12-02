package br.com.khaslu.dp;

public class Numero implements Expressao {

	private final Double numero;

	public Numero(final Number numero) {
		this.numero = numero.doubleValue();
	}

	@Override
	public Double calcular() {
		return this.numero;
	}

}
