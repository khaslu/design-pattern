package br.com.khaslu.dp;

public class Fatura {
	
	private final Cliente cliente;
	
	private final double valor;
	
	public Fatura(final Cliente cliente, final double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public Cliente getCliente() {

		return this.cliente;
	}
	
	public double getValor() {

		return this.valor;
	}
	
}
