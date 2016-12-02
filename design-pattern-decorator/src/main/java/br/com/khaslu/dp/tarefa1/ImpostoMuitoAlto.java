package br.com.khaslu.dp.tarefa1;

import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {
	}

	public ImpostoMuitoAlto(final Imposto impostoComposto) {
		super(impostoComposto);
	}

	@Override
	public double calcula(final Orcamento orcamento) {
		return (orcamento.getValor() * 0.2) + this.comporImposto(orcamento);
	}
}
