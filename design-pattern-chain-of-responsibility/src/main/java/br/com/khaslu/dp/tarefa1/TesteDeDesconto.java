package br.com.khaslu.dp.tarefa1;

import br.com.khaslu.dp.Desconto;
import br.com.khaslu.dp.DescontoPorCincoItens;
import br.com.khaslu.dp.DescontoPorMaisDeQuinhentosReais;
import br.com.khaslu.dp.Item;
import br.com.khaslu.dp.Orcamento;
import br.com.khaslu.dp.SemDesconto;

public class TesteDeDesconto {
	public static void main(final String[] args) {
		final Desconto d1 = new DescontoPorCincoItens();
		final Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		final Desconto d3 = new DescontoPorLapisCaneta();
		final Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		final Item lapis = new Item("LAPIS", 15.00);
		final Item caneta = new Item("CANETA", 15.00);
		final Item borracha = new Item("borracha", 15.00);

		final Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(caneta);
		orcamento.adicionaItem(borracha);
		orcamento.adicionaItem(lapis);

		final double desconto = d1.desconta(orcamento);
		System.out.println(desconto);
	}
}
