package br.com.khaslu.dp;

public class ContatoCliente {

	private final Cliente cliente;

	private final Cobranca cobranca;

	public ContatoCliente(final Cliente cliente, final Cobranca cobranca) {
		this.cliente = cliente;
		this.cobranca = cobranca;
	}

	public Cliente getCliente() {
		
		return this.cliente;
	}

	public Cobranca getCobranca() {
		
		return this.cobranca;
	}
	
	public void dispara() {
		
		System.out.println("Contado cliente disparado!");
	}

}
