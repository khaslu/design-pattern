package br.com.khaslu.dp.tarefa2;

import java.text.MessageFormat;

public class FormatoCSV implements ChainFormato {

	private ChainFormato chain;

	@Override
	public void setProximo(final ChainFormato chain) {
		this.chain = chain;
	}

	@Override
	public String converter(final Requisicao requisicao) {
		if (Formato.XML.equals(requisicao.getFormato())) {
			final StringBuilder sb = new StringBuilder();
			sb.append("<conta>");
			sb.append("<titular>");
			sb.append("{0}");
			sb.append("</titular>");
			sb.append("<saldo>");
			sb.append("{1}");
			sb.append("</saldo>");
			sb.append("</conta>");
			return MessageFormat.format(sb.toString(), requisicao.getConta().getTitular(),
					requisicao.getConta().getSaldo());
		}
		return this.chain.converter(requisicao);
	}

}
