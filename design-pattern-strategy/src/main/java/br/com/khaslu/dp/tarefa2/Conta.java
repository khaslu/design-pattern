package br.com.khaslu.dp.tarefa2;

public class Conta {
	private Double saldo;
	private String titular;

	public Conta(final Double saldo) {
		this.saldo = saldo;
	}

	public Conta(final Double saldo, final String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(final String titular) {
		this.titular = titular;
	}

	public void setSaldo(final Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + this.saldo + ", titular=" + this.titular + "]";
	}

}
