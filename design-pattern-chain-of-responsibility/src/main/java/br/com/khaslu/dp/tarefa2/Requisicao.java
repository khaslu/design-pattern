package br.com.khaslu.dp.tarefa2;

public class Requisicao {

	private final Formato formato;

	private final Conta conta;

	public Requisicao(final Conta conta, final Formato formato) {
		this.conta = conta;
		this.formato = formato;
	}

	public Formato getFormato() {

		return this.formato;
	}

	public Conta getConta() {

		return this.conta;
	}
}
