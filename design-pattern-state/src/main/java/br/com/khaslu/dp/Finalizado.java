package br.com.khaslu.dp;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaUmDescontoExtra(final Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprova(final Orcamento orcamento) {
		throw new RuntimeException("Estado já finalizado");
	}

	@Override
	public void reprova(final Orcamento orcamento) {
		throw new RuntimeException("Estado já finalizado");
	}

	@Override
	public void finaliza(final Orcamento orcamento) {
		throw new RuntimeException("Estado já finalizado");
	}
}
