package br.com.khaslu.dp;

public class SemDesconto extends AbstractDesconto {

	@Override
	protected double aplicarDesconto(final Orcamento orcamento) {
		return 0;
	}

	@Override
	protected boolean condicionalDesconto(final Orcamento orcamento) {
		return true;
	}

}
