package br.com.khaslu.dp;

public class BancoDeDados implements AcaoAposGerarNota {
	@Override
	public void executa(final NF nf) {
		System.out.println("Salvei no banco de dados");
	}
}
