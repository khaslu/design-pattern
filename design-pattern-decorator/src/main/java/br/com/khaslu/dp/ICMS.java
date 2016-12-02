package br.com.khaslu.dp;

public class ICMS extends Imposto {

	public ICMS() {
	}

	public ICMS(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	@Override
	public double calcula(final Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50.0 + this.comporImposto(orcamento);
	}
}
