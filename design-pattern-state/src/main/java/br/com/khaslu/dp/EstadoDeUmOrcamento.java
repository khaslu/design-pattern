package br.com.khaslu.dp;

public interface EstadoDeUmOrcamento {

	void aplicaUmDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprova(Orcamento orcamento);

	void finaliza(Orcamento orcamento);
}
