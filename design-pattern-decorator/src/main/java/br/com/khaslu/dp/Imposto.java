package br.com.khaslu.dp;

import java.util.Objects;

public abstract class Imposto {
	private Imposto impostoComposto;

	public Imposto() {
	}

	public Imposto(final Imposto impostoComposto) {
		this.impostoComposto = impostoComposto;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double comporImposto(final Orcamento orcamento) {
		if (Objects.isNull(this.impostoComposto)) {
			return 0;
		}
		return this.impostoComposto.calcula(orcamento);
	}
}
