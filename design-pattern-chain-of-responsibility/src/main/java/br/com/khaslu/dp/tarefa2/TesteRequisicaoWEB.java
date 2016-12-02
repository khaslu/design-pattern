package br.com.khaslu.dp.tarefa2;

public class TesteRequisicaoWEB {
	
	public static void main(final String[] args) {
		
		final Conta conta = new Conta(1000d, "Lucas Mota Vieira");
		final Requisicao xml = new Requisicao(conta, Formato.XML);
		final Requisicao csv = new Requisicao(conta, Formato.CSV);
		final Requisicao porc = new Requisicao(conta, Formato.PORCENTO);
		final Requisicao json = new Requisicao(conta, Formato.JSON);
		
		final ProcessarRequisicao processo = new ProcessarRequisicao();
		
		System.out.println("XML: \n" + processo.processar(xml));
		System.out.println("\n\nCSV: \n" + processo.processar(csv));
		System.out.println("\n\nPORCENTAGEM: \n" + processo.processar(porc));
		System.out.println("\n\nJSON (TXT): \n" + processo.processar(json));
	}
}
