package br.com.khaslu.dp;

public class IKCV extends AbstractTaxacaoCondicional {

	private boolean temItemMaiorQue100ReaisNo(final Orcamento orcamento) {

		for (final Item item : orcamento.getItems()) {
			if (item.getValor() > 100) { return true; }
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
