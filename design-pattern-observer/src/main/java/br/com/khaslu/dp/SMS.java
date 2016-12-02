package br.com.khaslu.dp;

public class SMS implements AcaoAposGerarNota {
	@Override
	public void executa(final NF nf) {
		System.out.println("Enviei por SMS");
	}
}
