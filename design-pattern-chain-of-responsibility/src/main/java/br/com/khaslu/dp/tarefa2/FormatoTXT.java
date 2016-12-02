package br.com.khaslu.dp.tarefa2;

public class FormatoTXT implements ChainFormato {

	@Override
	public void setProximo(final ChainFormato chain) {
	}

	@Override
	public String converter(final Requisicao requisicao) {
		return requisicao.getConta().toString();
	}

}
