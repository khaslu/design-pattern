package br.com.khaslu.dp.tarefa2;

import br.com.khaslu.dp.CalculadorDeImposto;
import br.com.khaslu.dp.ICMS;
import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Item;
import br.com.khaslu.dp.Orcamento;

public class TesteDeImpostosCondicional {
	public static void main(final String[] args) {
		final Imposto icpp = new ICPP(new IKCV(new ICMS()));

		final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		final Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("LAPIS", 100));
		orcamento.adicionaItem(new Item("BORRACHA", 200));

		calculadorDeImposto.realizaCalculo(orcamento, icpp);
	}
}
