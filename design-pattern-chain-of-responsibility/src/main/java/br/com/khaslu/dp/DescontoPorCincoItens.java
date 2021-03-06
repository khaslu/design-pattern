package br.com.khaslu.dp;

public class DescontoPorCincoItens extends AbstractDesconto {

	@Override
	protected double aplicarDesconto(final Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean condicionalDesconto(final Orcamento orcamento) {
		return orcamento.getItems().size() > 5;
	}
}