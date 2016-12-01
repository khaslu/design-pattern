package br.com.khaslu.dp.tarefa2;

public class Conservador implements Investimento {

	@Override
	public double investir(final double valor) {
		return valor * 0.008;
	}

}
