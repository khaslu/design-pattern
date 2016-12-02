package br.com.khaslu.dp;

public interface Desconto {
	double desconta(Orcamento orcamento);

	void setProximo(Desconto desconto);
}
