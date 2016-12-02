package br.com.khaslu.dp.tarefa2;

import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Item;
import br.com.khaslu.dp.Orcamento;

public class IKCV extends AbstractTaxacaoCondicional {

	public IKCV() {
	}

	public IKCV(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	private boolean temItemMaiorQue100ReaisNo(final Orcamento orcamento) {
		for (final Item item : orcamento.getItems()) {
			if (item.getValor() > 100) {
				return true;
			}
		}

		return false;
	}

	@Override
	protected double calcularMenorTaxa(final Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double calcularMaiorTaxa(final Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean isMaiorTaxa(final Orcamento orcamento) {
		return (orcamento.getValor() > 500) && this.temItemMaiorQue100ReaisNo(orcamento);
	}

}
