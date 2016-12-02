package br.com.khaslu.dp;

public class ItemBuilder {
	private String nome;
	private double valor;

	public ItemBuilder comNome(final String nome) {
		this.nome = nome;
		return this;
	}

	public ItemBuilder comValor(final double valor) {
		this.valor = valor;
		return this;
	}

	public Item build() {
		return new Item(this.nome, this.valor);
	}

}
