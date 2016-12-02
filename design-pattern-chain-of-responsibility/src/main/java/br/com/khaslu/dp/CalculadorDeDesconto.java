package br.com.khaslu.dp;

import br.com.khaslu.dp.tarefa1.DescontoPorLapisCaneta;

public class CalculadorDeDesconto {
	public double calcularDesconto(final Orcamento orcamento) {
		final Desconto d1 = new DescontoPorCincoItens();
		final Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		final Desconto d3 = new DescontoPorLapisCaneta();
		final Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		return d1.desconta(orcamento);
	}
}
