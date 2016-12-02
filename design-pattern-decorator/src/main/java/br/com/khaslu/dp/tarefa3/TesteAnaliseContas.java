package br.com.khaslu.dp.tarefa3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class TesteAnaliseContas {
	public static void main(final String[] args) {
		final List<Conta> contas = new ArrayList<>();
		contas.add(new Conta(70, LocalDate.now().withMonth(1))); // vai
		contas.add(new Conta(200, LocalDate.now().withMonth(1))); // não vai
		contas.add(new Conta(200, LocalDate.now().withYear(2015))); // não vai
		contas.add(new Conta(600000, LocalDate.now().withMonth(1))); // vai

		contas.add(new Conta(70, LocalDate.now())); // vai
		contas.add(new Conta(200, LocalDate.now())); // vai
		contas.add(new Conta(600000, LocalDate.now())); // vai

		final Analise analise = new ContasComAberturaNoMesCorrente(
				new ContasComSaldoMaiorQueQuinhentosMilReais(new ContasComSaldoMenorQueCemReais()));
		System.out.println(StringUtils.join(analise.processar(contas).toArray(), "\n"));
	}
}
