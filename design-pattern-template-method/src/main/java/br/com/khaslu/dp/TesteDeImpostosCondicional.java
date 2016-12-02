package br.com.khaslu.dp;

public class TesteDeImpostosCondicional {

	public static void main(final String[] args) {

		final Imposto icpp = new ICPP();
		final Imposto ikcv = new IKCV();

		final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		final Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("LAPIS", 100));
		orcamento.adicionaItem(new Item("BORRACHA", 200));

		calculadorDeImposto.realizaCalculo(orcamento, icpp);
		calculadorDeImposto.realizaCalculo(orcamento, ikcv);
	}
}
