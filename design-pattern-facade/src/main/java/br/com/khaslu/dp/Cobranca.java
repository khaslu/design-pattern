package br.com.khaslu.dp;

public class Cobranca {

	private final Tipo boleto;

	private final Fatura fatura;

	public Cobranca(final Tipo boleto, final Fatura fatura) {
		this.boleto = boleto;
		this.fatura = fatura;
	}

	public Tipo getBoleto() {
		
		return this.boleto;
	}

	public Fatura getFatura() {
		
		return this.fatura;
	}
	
	public void emite() {
		
		System.out.println("Cobrança emitida!");
	}

}
