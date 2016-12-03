package br.com.khaslu.dp;

public class EmpresaFacade {
	
	public Cliente buscaCliente(final String cgc) {
		
		return new Cliente(cgc);
	}
	
	public Fatura criaFatura(final Cliente cliente, final double valor) {

		final Fatura fatura = new Fatura(cliente, valor);
		return fatura;
	}

	public Cobranca geraCobranca(final Fatura fatura) {

		final Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();

		return cobranca;
	}

	public ContatoCliente fazContato(final Cliente cliente, final Cobranca cobranca) {

		final ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();

		return contato;
	}
}
