package br.com.khaslu.dp.tarefa2;

import java.util.Random;

public class Arrojado implements Investimento {

	@Override
	public double investir(final double valor) {
		final Random random = new Random();
		final double porcentagem = Math.abs(random.nextInt(10) + 1);
		if (porcentagem > 8) {
			return valor * 0.05;
		}
		if (porcentagem > 5) {
			return valor * 0.03;
		}
		return valor * 0.006;
	}

}
