package br.com.khaslu.dp.tarefa3;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class Analise {
	private Analise proximaAnalise;

	public Analise() {
	}

	public Analise(final Analise proximaAnalise) {
		this.proximaAnalise = proximaAnalise;
	}

	public Set<Conta> nextStep(final List<Conta> contas) {
		if (Objects.nonNull(this.proximaAnalise)) {
			return this.proximaAnalise.processar(contas);
		}
		return new HashSet<>();
	}

	protected abstract Set<Conta> processar(final List<Conta> contas);

}
