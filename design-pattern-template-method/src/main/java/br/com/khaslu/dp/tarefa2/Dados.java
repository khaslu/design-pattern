package br.com.khaslu.dp.tarefa2;

public class Dados {
	private String nome;
	private Integer idade;
	private String conta;
	private String agencia;
	private Double saldo;

	public Dados(final String nome, final Integer idade, final String conta, final String agencia, final Double saldo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return this.idade;
	}

	public void setIdade(final Integer idade) {
		this.idade = idade;
	}

	public String getConta() {
		return this.conta;
	}

	public void setConta(final String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(final String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(final Double saldo) {
		this.saldo = saldo;
	}

}
