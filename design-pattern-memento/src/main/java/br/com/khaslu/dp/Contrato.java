package br.com.khaslu.dp;

import java.time.LocalDate;

public class Contrato implements Memo<Contrato> {
	private LocalDate data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(final LocalDate data, final String cliente, final TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public void avanca() {
		if (this.tipo == TipoContrato.NOVO) {
			this.tipo = TipoContrato.EM_ANDAMENTO;
		} else if (this.tipo == TipoContrato.EM_ANDAMENTO) {
			this.tipo = TipoContrato.ACERTADO;
		} else if (this.tipo == TipoContrato.ACERTADO) {
			this.tipo = TipoContrato.CONCLUIDO;
		}
	}

	public LocalDate getData() {
		return this.data;
	}

	public void setData(final LocalDate data) {
		this.data = data;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(final String cliente) {
		this.cliente = cliente;
	}

	public TipoContrato getTipo() {
		return this.tipo;
	}

	public void setTipo(final TipoContrato tipo) {
		this.tipo = tipo;
	}

	@Override
	public Estado<Contrato> saveLocal() {
		return new Estado<>(new Contrato(this.data, this.cliente, this.tipo));
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("\nContrato:\n\tdata=");
		builder.append(this.data);
		builder.append("\n\tcliente=");
		builder.append(this.cliente);
		builder.append("\n\ttipo=");
		builder.append(this.tipo);
		builder.append("\n");
		return builder.toString();
	}

	@Override
	public void restore(final Estado<Contrato> estado) {
		this.data = estado.getObjeto().getData();
		this.tipo = estado.getObjeto().getTipo();
		this.cliente = estado.getObjeto().getCliente();
	}

}
