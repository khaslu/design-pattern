package br.com.khaslu.dp.tarefa3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContasComSaldoMaiorQueQuinhentosMilReais extends Analise {

	public ContasComSaldoMaiorQueQuinhentosMilReais() {
	}

	public ContasComSaldoMaiorQueQuinhentosMilReais(final Analise proximaAnalise) {
		super(proximaAnalise);
	}

	@Override
	public Set<Conta> processar(final List<Conta> contas) {
		final Set<Conta> contasSuspeitas = contas.stream().filter(conta -> conta.getSaldo() > 500000)
				.collect(Collectors.toSet());
		contasSuspeitas.addAll(this.nextStep(contas));
		return contasSuspeitas;
	}

}
