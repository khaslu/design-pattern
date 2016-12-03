package br.com.khaslu.dp;

import java.time.LocalDate;

public class Pedido {

	private String cliente;

	private double valor;
	
	private Status status;

	private LocalDate dataFinalizacao;

	public Pedido(final String cliente, final double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}

	public void paga() {

		this.status = Status.PAGO;
	}

	public void finaliza() {

		this.dataFinalizacao = LocalDate.now();
		this.status = Status.ENTREGUE;
	}
	
	public String getCliente() {

		return this.cliente;
	}
	
	public void setCliente(final String cliente) {

		this.cliente = cliente;
	}
	
	public double getValor() {

		return this.valor;
	}
	
	public void setValor(final double valor) {

		this.valor = valor;
	}
	
	public Status getStatus() {

		return this.status;
	}
	
	public void setStatus(final Status status) {

		this.status = status;
	}
	
	public LocalDate getDataFinalizacao() {

		return this.dataFinalizacao;
	}
	
	public void setDataFinalizacao(final LocalDate dataFinalizacao) {

		this.dataFinalizacao = dataFinalizacao;
	}

}
