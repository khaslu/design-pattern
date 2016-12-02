package br.com.khaslu.dp;

public class TesteDeDesconto {
	public static void main(final String[] args) {
		final CalculadorDeDesconto calculador = new CalculadorDeDesconto();

		final Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));

		final double desconto = calculador.calcularDesconto(orcamento);

		System.out.println(desconto);

	}
}
