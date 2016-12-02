package br.com.khaslu.dp.tarefa2;

import java.text.MessageFormat;

public class FormatoPorc implements ChainFormato {

	private ChainFormato chain;

	@Override
	public void setProximo(final ChainFormato chain) {
		this.chain = chain;
	}

	@Override
	public String converter(final Requisicao requisicao) {
		if (Formato.PORCENTO.equals(requisicao.getFormato())) {
			final StringBuilder sb = new StringBuilder();
			sb.append("titular%");
			sb.append("saldo\n");
			sb.append("{0}%");
			sb.append("{1}\n");
			return MessageFormat.format(sb.toString(), requisicao.getConta().getTitular(),
					requisicao.getConta().getSaldo());
		}
		return this.chain.converter(requisicao);
	}

}
