package br.com.khaslu.dp.tarefa1;

import br.com.khaslu.dp.CalculadorDeImposto;
import br.com.khaslu.dp.ICMS;
import br.com.khaslu.dp.ISS;
import br.com.khaslu.dp.Imposto;
import br.com.khaslu.dp.Orcamento;

public class TesteDeImpostos {
	public static void main(final String[] args) {
		final Imposto iss = new ISS(new ICMS(new ImpostoMuitoAlto()));

		final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		final Orcamento orcamento = new Orcamento(500);

		calculadorDeImposto.realizaCalculo(orcamento, iss);
	}
}
