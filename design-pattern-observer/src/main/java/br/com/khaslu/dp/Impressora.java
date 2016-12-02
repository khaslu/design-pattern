package br.com.khaslu.dp;

public class Impressora implements AcaoAposGerarNota {
	@Override
	public void executa(final NF nf) {
		System.out.println("Imprimi NF");
	}
}
