package br.com.khaslu.dp;

public class DescontoPorMaisDeQuinhentosReais extends AbstractDesconto {

	@Override
	protected double aplicarDesconto(final Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean condicionalDesconto(final Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
