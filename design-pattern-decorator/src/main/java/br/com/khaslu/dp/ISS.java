package br.com.khaslu.dp;

public class ISS extends Imposto {

	public ISS() {
	}

	public ISS(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	@Override
	public double calcula(final Orcamento orcamento) {
		return (orcamento.getValor() * 0.06) + this.comporImposto(orcamento);
	}
}
