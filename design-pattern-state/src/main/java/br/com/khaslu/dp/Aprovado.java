package br.com.khaslu.dp;

public class Aprovado implements EstadoDeUmOrcamento {

	boolean aplicadoDesconto = false;

	@Override
	public void aplicaUmDescontoExtra(final Orcamento orcamento) {
		if (!this.aplicadoDesconto) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
		}
		this.aplicadoDesconto = true;
	}

	@Override
	public void aprova(final Orcamento orcamento) {
		throw new RuntimeException("Estado já aprovado");
	}

	@Override
	public void reprova(final Orcamento orcamento) {
		throw new RuntimeException("Estado aprovado não pode ser reprovado");
	}

	@Override
	public void finaliza(final Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
