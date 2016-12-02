package br.com.khaslu.dp;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	private double valor;
	private List<Item> items;

	private EstadoDeUmOrcamento estado;

	public Orcamento(final double valor) {
		this.valor = valor;
		this.items = new ArrayList<>();
		this.estado = new EmAprovacao();
	}

	public void aplicaUmDescontoExtra() {
		this.estado.aplicaUmDescontoExtra(this);
	}

	public void aprova() {
		this.estado.aprova(this);
	}

	public void reprova() {
		this.estado.reprova(this);
	}

	public void finaliza() {
		this.estado.finaliza(this);
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(final double valor) {
		this.valor = valor;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(final List<Item> items) {
		this.items = items;
	}

	public EstadoDeUmOrcamento getEstado() {
		return this.estado;
	}

	public void setEstado(final EstadoDeUmOrcamento estado) {
		this.estado = estado;
	}

}
