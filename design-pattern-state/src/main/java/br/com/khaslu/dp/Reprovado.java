package br.com.khaslu.dp;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaUmDescontoExtra(final Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(final Orcamento orcamento) {
		throw new RuntimeException("Estado reaprovado não pode ser aprovado");
	}

	@Override
	public void reprova(final Orcamento orcamento) {
		throw new RuntimeException("Estado já reprovado");
	}

	@Override
	public void finaliza(final Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}
}
