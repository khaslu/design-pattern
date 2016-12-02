package br.com.khaslu.dp.tarefa1;

public abstract class Estado {

	public static final Estado alternarEstado(final Conta conta) {
		if (conta.saldo < 0) {
			return new Negativo();
		}
		return new Positivo();

	}

	protected abstract void saque(Conta conta, double valor);

	protected abstract void deposito(Conta conta, double valor);
}
