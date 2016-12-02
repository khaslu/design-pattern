package br.com.khaslu.dp;

public class Multiplicador implements AcaoAposGerarNota {

	private final double fator;

	public Multiplicador(final double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(final NF nf) {
		System.out.println(nf.getValorBruto() * this.fator);
	}

}
