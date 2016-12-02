package br.com.khaslu.dp;

public class ICPP extends AbstractTaxacaoCondicional {
	
	@Override
	protected double calcularMenorTaxa(final Orcamento orcamento) {
		
		return orcamento.getValor() * 0.05;
	}
	
	@Override
	protected double calcularMaiorTaxa(final Orcamento orcamento) {
		
		return orcamento.getValor() * 0.07;
	}
	
	@Override
	protected boolean isMaiorTaxa(final Orcamento orcamento) {
		
		return orcamento.getValor() > 500;
	}
	
}
