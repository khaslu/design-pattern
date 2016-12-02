package br.com.khaslu.dp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.khaslu.dp.tarefa1.ItemBuilder;

public class NFBuilder {
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<Item> itens;
	public String observacoes;

	public NFBuilder() {
		this.itens = new ArrayList<>();
	}

	public NFBuilder comRazaoSocial(final String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NFBuilder comCnpj(final String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NFBuilder comDataDeEmissao(final LocalDate dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
		return this;
	}

	public NFBuilder comDataAtual() {
		this.dataDeEmissao = LocalDate.now();
		return this;
	}

	public NFBuilder adicionarItem(final ItemBuilder item) {
		this.itens.add(item.build());
		this.valorBruto += item.build().getValor();
		this.impostos += this.impostos += item.build().getValor() * 0.05;
		return this;
	}

	public NFBuilder comObservacoes(final String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NF build() {
		return new NF(this.razaoSocial, this.cnpj, this.dataDeEmissao, this.valorBruto, this.impostos, this.itens,
				this.observacoes);
	}

}
