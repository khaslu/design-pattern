package br.com.khaslu.dp.tarefa1;

public class Positivo extends Estado {

	@Override
	public void saque(final Conta conta, final double valor) {
		conta.saldo = conta.saldo - valor;
		conta.estado = Estado.alternarEstado(conta);
	}

	@Override
	public void deposito(final Conta conta, final double valor) {
		conta.saldo = conta.saldo + (valor * 0.98);
		conta.estado = Estado.alternarEstado(conta);
	}

	@Override
	public String toString() {
		return "Positivo";
	}
}
