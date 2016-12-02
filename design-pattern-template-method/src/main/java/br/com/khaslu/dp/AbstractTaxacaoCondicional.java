package br.com.khaslu.dp;

public abstract class AbstractTaxacaoCondicional implements Imposto {
	
	@Override
	public double calcula(final Orcamento orcamento) {
		
		if (this.isMaiorTaxa(orcamento)) {
			return this.calcularMaiorTaxa(orcamento);
		} else {
			return this.calcularMenorTaxa(orcamento);
		}
	}
	
	protected abstract double calcularMenorTaxa(Orcamento orcamento);
	
	protected abstract double calcularMaiorTaxa(Orcamento orcamento);
	
	protected abstract boolean isMaiorTaxa(Orcamento orcamento);
	
}
