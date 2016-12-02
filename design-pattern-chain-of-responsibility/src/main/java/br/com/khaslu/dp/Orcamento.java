package br.com.khaslu.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	private final double valor;
	private final List<Item> items;

	public Orcamento(final double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
	}

	public double getValor() {
		return this.valor;
	}

	public void adicionaItem(final Item item) {
		this.items.add(item);
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(this.items);
	}

}
