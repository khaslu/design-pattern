package br.com.khaslu.dp;

public class Programa {

	public static void main(final String[] args) {

		final EmpresaFacade empresaFacade = EmpresaFacadeSingleton.getInstance();
		
		final Cliente buscaCliente = empresaFacade.buscaCliente("123");
		final Fatura criaFatura = empresaFacade.criaFatura(buscaCliente, 5000);
		final Cobranca geraCobranca = empresaFacade.geraCobranca(criaFatura);
		empresaFacade.fazContato(buscaCliente, geraCobranca);

	}
}
