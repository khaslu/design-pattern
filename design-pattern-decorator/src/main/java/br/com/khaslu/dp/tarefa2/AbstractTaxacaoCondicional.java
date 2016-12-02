package br.com.khaslu.dp.tarefa2;

import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Orcamento;

public abstract class AbstractTaxacaoCondicional extends Imposto {

	public AbstractTaxacaoCondicional() {
	}

	public AbstractTaxacaoCondicional(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	@Override
	public double calcula(final Orcamento orcamento) {
		if (this.isMaiorTaxa(orcamento)) {
			return this.calcularMaiorTaxa(orcamento) + this.comporImposto(orcamento);
		} else {
			return this.calcularMenorTaxa(orcamento) + this.comporImposto(orcamento);
		}
	}

	protected abstract double calcularMenorTaxa(Orcamento orcamento);

	protected abstract double calcularMaiorTaxa(Orcamento orcamento);

	protected abstract boolean isMaiorTaxa(Orcamento orcamento);

}
