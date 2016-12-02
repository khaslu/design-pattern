package br.com.khaslu.dp.tarefa2;

public interface ChainFormato {
	String converter(Requisicao requisicao);

	void setProximo(ChainFormato chain);
}
