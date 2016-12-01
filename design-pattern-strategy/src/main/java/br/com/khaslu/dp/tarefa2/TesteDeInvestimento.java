package br.com.khaslu.dp.tarefa2;

public class TesteDeInvestimento {

	public static void main(final String[] args) {
		final Investimento conservador = new Conservador();
		final Investimento moderado = new Moderado();
		final Investimento arrojado = new Arrojado();

		final Conta conta = new Conta(1000D);

		final RealizadorDeInvestimentos calculo = new RealizadorDeInvestimentos();

		calculo.realizarInvestimento(conta, conservador);
		calculo.realizarInvestimento(conta, moderado);
		calculo.realizarInvestimento(conta, arrojado);
	}
}
