package br.com.khaslu.dp;

import java.time.LocalDate;
import java.util.List;

public class NF {
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<Item> itens;
	public String observacoes;

	public NF(final String razaoSocial, final String cnpj, final LocalDate dataDeEmissao, final double valorBruto,
			final double impostos, final List<Item> itens, final String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(final String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(final String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataDeEmissao() {
		return this.dataDeEmissao;
	}

	public void setDataDeEmissao(final LocalDate dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public double getValorBruto() {
		return this.valorBruto;
	}

	public void setValorBruto(final double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getImpostos() {
		return this.impostos;
	}

	public void setImpostos(final double impostos) {
		this.impostos = impostos;
	}

	public List<Item> getItens() {
		return this.itens;
	}

	public void setItens(final List<Item> itens) {
		this.itens = itens;
	}

	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(final String observacoes) {
		this.observacoes = observacoes;
	}

}
