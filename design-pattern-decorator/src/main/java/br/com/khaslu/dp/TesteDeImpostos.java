package br.com.khaslu.dp;

public class TesteDeImpostos {
	public static void main(final String[] args) {
		final Imposto iss = new ISS(new ICMS());

		final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		final Orcamento orcamento = new Orcamento(500);

		calculadorDeImposto.realizaCalculo(orcamento, iss);
	}
}
