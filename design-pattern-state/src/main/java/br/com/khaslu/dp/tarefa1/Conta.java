package br.com.khaslu.dp.tarefa1;

public class Conta {
	protected Double saldo;

	protected Estado estado;

	public Conta(final Double saldo) {
		this.saldo = saldo;
		this.estado = Estado.alternarEstado(this);
	}

	public void sacar(final double valor) {
		this.estado.saque(this, valor);
	}

	public void depositar(final double valor) {
		this.estado.deposito(this, valor);
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("\nConta:\n\tsaldo=");
		builder.append(this.saldo);
		builder.append("\n\testado=");
		builder.append(this.estado);
		builder.append("\n");
		return builder.toString();
	}

}
