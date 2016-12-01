package br.com.khaslu.dp;

import br.com.khaslu.dp.tarefa1.ICCC;

public class TesteDeImpostos {
	public static void main(final String[] args) {
		final Imposto iss = new ISS();
		final Imposto icms = new ICMS();
		final Imposto iccc = new ICCC();

		final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		final Orcamento orcamento = new Orcamento(500);

		calculadorDeImposto.realizaCalculo(orcamento, iss);
		calculadorDeImposto.realizaCalculo(orcamento, icms);

		final Orcamento orcamento1 = new Orcamento(500);
		final Orcamento orcamento2 = new Orcamento(2500);
		final Orcamento orcamento3 = new Orcamento(3500);
		calculadorDeImposto.realizaCalculo(orcamento1, iccc);
		calculadorDeImposto.realizaCalculo(orcamento2, iccc);
		calculadorDeImposto.realizaCalculo(orcamento3, iccc);
	}
}
