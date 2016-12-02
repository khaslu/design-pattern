package br.com.khaslu.dp.tarefa1;

import br.com.khaslu.dp.AbstractDesconto;
import br.com.khaslu.dp.Item;
import br.com.khaslu.dp.Orcamento;

public class DescontoPorLapisCaneta extends AbstractDesconto {
	
	public static boolean naPromocao(final String nomeProduto) {
		
		switch (nomeProduto) {
		case "CANETA":
			return true;
		case "LAPIS":
			return true;
		default:
			return false;
		}
	}
	
	@Override
	protected double aplicarDesconto(final Orcamento orcamento) {
		
		return orcamento.getValor() * 0.05;
	}
	
	@Override
	protected boolean condicionalDesconto(final Orcamento orcamento) {
		
		return orcamento.getItems().stream().map(Item::getNome).filter(DescontoPorLapisCaneta::naPromocao).distinct()
				.count() >= 2;
	}
}
