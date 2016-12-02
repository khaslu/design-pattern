package br.com.khaslu.dp;

public class TesteEstado {
	public static void main(final String[] args) {
		final Orcamento orcamento = new Orcamento(500);
		System.out.println(orcamento.getValor());

		orcamento.aplicaUmDescontoExtra();
		System.out.println(orcamento.getValor());

		orcamento.aprova();
		orcamento.aplicaUmDescontoExtra();
		orcamento.aplicaUmDescontoExtra();
		orcamento.aplicaUmDescontoExtra();
		orcamento.aplicaUmDescontoExtra();
		System.out.println(orcamento.getValor());

		orcamento.finaliza();
	}
}
