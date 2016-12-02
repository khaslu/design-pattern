package br.com.khaslu.dp.tarefa1;

import java.util.HashSet;

import br.com.khaslu.dp.AbstractTaxacaoCondicional;
import br.com.khaslu.dp.Item;
import br.com.khaslu.dp.Orcamento;

public class IHIT extends AbstractTaxacaoCondicional {
	
	@Override
	protected double calcularMenorTaxa(final Orcamento orcamento) {
		
		return orcamento.getValor() * 0.01 * orcamento.getItems().size();
	}
	
	@Override
	protected double calcularMaiorTaxa(final Orcamento orcamento) {
		
		return (orcamento.getValor() * 0.13) + 100;
	}
	
	@Override
	protected boolean isMaiorTaxa(final Orcamento orcamento) {
		
		return !orcamento.getItems().stream().map(Item::getNome).allMatch(new HashSet<>()::add);
	}
	
}
