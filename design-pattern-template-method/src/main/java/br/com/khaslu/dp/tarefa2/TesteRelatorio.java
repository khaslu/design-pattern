package br.com.khaslu.dp.tarefa2;

public class TesteRelatorio {
	public static void main(final String[] args) {
		final Dados dados = new Dados("Lucas Mota Vieira", 26, "12345-6", "0999", 1000D);
		final Relatorio cliente = new RelatorioCliente();
		final Relatorio gerente = new RelatorioGerente();

		System.out.println(cliente.gerar(dados));
		System.out.println("\n\n--------------------------\n\n");
		System.out.println(gerente.gerar(dados));
	}
}
