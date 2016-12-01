package br.com.khaslu.dp.tarefa2;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double investir(final double valor) {
		if (new Random().nextBoolean()) {
			return valor * 0.025;
		}
		return valor * 0.007;
	}

}
