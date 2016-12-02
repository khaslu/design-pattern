package br.com.khaslu.dp;

public class EmAprovacao implements EstadoDeUmOrcamento {

	boolean aplicadoDesconto = false;

	@Override
	public void aplicaUmDescontoExtra(final Orcamento orcamento) {
		if (!this.aplicadoDesconto) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.05));
		}
		this.aplicadoDesconto = true;
	}

	@Override
	public void aprova(final Orcamento orcamento) {
		orcamento.setEstado(new Aprovado());
	}

	@Override
	public void reprova(final Orcamento orcamento) {
		orcamento.setEstado(new Reprovado());
	}

	@Override
	public void finaliza(final Orcamento orcamento) {
		throw new RuntimeException("Estado em aprovação não pode ser finalizado");
	}

}
