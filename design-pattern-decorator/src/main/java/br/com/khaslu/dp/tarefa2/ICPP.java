package br.com.khaslu.dp.tarefa2;

import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Orcamento;

public class ICPP extends AbstractTaxacaoCondicional {

	public ICPP() {
	}

	public ICPP(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	@Override
	protected double calcularMenorTaxa(final Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double calcularMaiorTaxa(final Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean isMaiorTaxa(final Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
