package br.com.khaslu.dp.tarefa3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContasComSaldoMenorQueCemReais extends Analise {

	public ContasComSaldoMenorQueCemReais() {
	}

	public ContasComSaldoMenorQueCemReais(final Analise proximaAnalise) {
		super(proximaAnalise);
	}

	@Override
	public Set<Conta> processar(final List<Conta> contas) {
		final Set<Conta> contasSuspeitas = contas.stream().filter(conta -> conta.getSaldo() < 100)
				.collect(Collectors.toSet());
		contasSuspeitas.addAll(this.nextStep(contas));
		return contasSuspeitas;
	}

}
