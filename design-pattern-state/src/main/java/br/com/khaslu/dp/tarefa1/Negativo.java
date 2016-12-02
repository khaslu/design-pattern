package br.com.khaslu.dp.tarefa1;

public class Negativo extends Estado {

	@Override
	public void saque(final Conta conta, final double valor) {
		conta.estado = Estado.alternarEstado(conta);
		throw new RuntimeException("Não é permitido efetuar um saque no vermelho");
	}

	@Override
	public void deposito(final Conta conta, final double valor) {
		conta.saldo = conta.saldo + (valor * 0.95);
		conta.estado = Estado.alternarEstado(conta);
	}

	@Override
	public String toString() {
		return "Negativo";
	}

}
