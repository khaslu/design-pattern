package br.com.khaslu.dp.tarefa2;

public class ProcessarRequisicao {
	public String processar(final Requisicao requisicao) {
		final ChainFormato xml = new FormatoXML();
		final ChainFormato csv = new FormatoCSV();
		final ChainFormato porc = new FormatoPorc();
		final ChainFormato txt = new FormatoTXT();

		xml.setProximo(csv);
		csv.setProximo(porc);
		porc.setProximo(txt);

		return xml.converter(requisicao);
	}
}
