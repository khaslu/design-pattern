package br.com.khaslu.dp.tarefa3;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContasComAberturaNoMesCorrente extends Analise {

	public ContasComAberturaNoMesCorrente() {
	}

	public ContasComAberturaNoMesCorrente(final Analise proximaAnalise) {
		super(proximaAnalise);
	}

	@Override
	public Set<Conta> processar(final List<Conta> contas) {
		final Set<Conta> contasSuspeitas = contas.stream().filter(ContasComAberturaNoMesCorrente::isAnoMesIgual)
				.collect(Collectors.toSet());
		contasSuspeitas.addAll(this.nextStep(contas));
		return contasSuspeitas;
	}

	private static final boolean isAnoMesIgual(final Conta conta) {
		final LocalDate dtAbertura = conta.getDataAbertura();
		final LocalDate hj = LocalDate.now();
		final boolean mesIgual = dtAbertura.getMonth().equals(hj.getMonth());
		final boolean anoIgual = dtAbertura.getYear() == hj.getYear();
		return mesIgual && anoIgual;
	}

}
