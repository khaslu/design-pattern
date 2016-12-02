package br.com.khaslu.dp;

public class Item {
	private String nome;
	private double valor;

	public Item(final String nome, final double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(final double valor) {
		this.valor = valor;
	}

}
