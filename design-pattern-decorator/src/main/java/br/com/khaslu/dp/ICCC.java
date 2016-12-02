package br.com.khaslu.dp;

public class ICCC extends Imposto {

	public ICCC() {
	}

	public ICCC(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	@Override
	public double calcula(final Orcamento orcamento) {
		if (orcamento.getValor() < 1000) {
			return (orcamento.getValor() * 0.05) + this.comporImposto(orcamento);
		} else if (orcamento.getValor() <= 3000) {
			return (orcamento.getValor() * 0.07) + this.comporImposto(orcamento);
		} else {
			return (orcamento.getValor() * 0.08) + 30 + this.comporImposto(orcamento);
		}
	}

}
