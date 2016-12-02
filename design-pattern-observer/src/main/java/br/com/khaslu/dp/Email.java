package br.com.khaslu.dp;

public class Email implements AcaoAposGerarNota {
	@Override
	public void executa(final NF nf) {
		System.out.println("Enviei por email");
	}
}
