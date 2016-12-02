package br.com.khaslu.dp.tarefa1;

import br.com.khaslu.dp.CalculadorDeImposto;
import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Item;
import br.com.khaslu.dp.Orcamento;

public class TesteDeImpostosCondicionalIHIT {
	
	public static void main(final String[] args) {
		
		final Imposto ihit = new IHIT();
		
		final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		final Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("LAPIS", 100));
		orcamento.adicionaItem(new Item("BORRACHA", 200));
		
		calculadorDeImposto.realizaCalculo(orcamento, ihit);
		orcamento.adicionaItem(new Item("LAPIS", 100));
		calculadorDeImposto.realizaCalculo(orcamento, ihit);
	}
}
