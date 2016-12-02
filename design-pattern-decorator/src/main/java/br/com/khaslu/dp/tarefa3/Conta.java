package br.com.khaslu.dp.tarefa3;

import java.time.LocalDate;

public class Conta {
	private double saldo;
	private LocalDate dataAbertura;

	public Conta(final double saldo, final LocalDate dataAbertura) {
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(final double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getDataAbertura() {
		return this.dataAbertura;
	}

	public void setDataAbertura(final LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.dataAbertura == null) ? 0 : this.dataAbertura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(this.saldo);
		result = (prime * result) + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Conta other = (Conta) obj;
		if (this.dataAbertura == null) {
			if (other.dataAbertura != null) {
				return false;
			}
		} else if (!this.dataAbertura.equals(other.dataAbertura)) {
			return false;
		}
		if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("\nConta:\n\tsaldo=");
		builder.append(this.saldo);
		builder.append("\n\tdataAbertura=");
		builder.append(this.dataAbertura);
		builder.append("\n");
		return builder.toString();
	}

}
