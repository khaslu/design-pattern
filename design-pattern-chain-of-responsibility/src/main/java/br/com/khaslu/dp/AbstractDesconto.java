package br.com.khaslu.dp;

public abstract class AbstractDesconto implements Desconto {

	private Desconto desconto;

	@Override
	public double desconta(final Orcamento orcamento) {

		if (this.condicionalDesconto(orcamento)) {
			return this.aplicarDesconto(orcamento);
		}

		return this.desconto.desconta(orcamento);
	}

	protected abstract double aplicarDesconto(Orcamento orcamento);

	protected abstract boolean condicionalDesconto(Orcamento orcamento);

	@Override
	public void setProximo(final Desconto desconto) {
		this.desconto = desconto;

	}

}
