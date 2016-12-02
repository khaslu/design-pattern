package br.com.khaslu.dp;

import br.com.khaslu.dp.tarefa1.ItemBuilder;

public class TestaNF {
	public static void main(String[] args) {
		NFBuilder builder = new  NFBuilder();
		builder.comRazaoSocial("Lucas Mota Vieira")
		.comCnpj("327.929.838-50")
		.comObservacoes("Alguma observação")
		.comDataAtual()
		.adicionarItem(new ItemBuilder().comNome("Item 1").comValor(200d))
		.adicionarItem(new ItemBuilder().comNome("Item 2").comValor(300d))
		.adicionarItem(new ItemBuilder().comNome("Item 3").comValor(400d));
		
		NF nf = builder.build();
		
		System.out.println(nf.getValorBruto());
	}
}
