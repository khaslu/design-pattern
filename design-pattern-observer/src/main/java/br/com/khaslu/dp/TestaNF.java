package br.com.khaslu.dp;

import java.util.Arrays;

public class TestaNF {
	public static void main(final String[] args) {
		final NFBuilder builder = new NFBuilder(
				Arrays.asList(new Impressora(), new Email(), new SMS(), new BancoDeDados(), new Multiplicador(3d)));
		builder.comRazaoSocial("Lucas Mota Vieira").comCnpj("327.929.838-50").comObservacoes("Alguma observação")
				.comDataAtual().adicionarItem(new ItemBuilder().comNome("Item 1").comValor(200d))
				.adicionarItem(new ItemBuilder().comNome("Item 2").comValor(300d))
				.adicionarItem(new ItemBuilder().comNome("Item 3").comValor(400d));

		final NF nf = builder.build();

		System.out.println(nf.getValorBruto());
	}
}
