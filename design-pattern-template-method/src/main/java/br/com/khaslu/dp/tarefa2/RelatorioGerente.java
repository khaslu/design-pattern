package br.com.khaslu.dp.tarefa2;

public class RelatorioGerente extends AbstractRelatorio {

	@Override
	protected String getRodape() {
		final StringBuilder sb = new StringBuilder();
		sb.append("2016");
		sb.append("\n");
		sb.append("São Paulo");
		sb.append("\n");
		sb.append("Informação secreta");
		return sb.toString();
	}

	@Override
	protected String getCorpo() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(this.dados.getNome());
		sb.append("\n");
		sb.append("Idade: ");
		sb.append(this.dados.getIdade());
		sb.append("\n");
		sb.append("Agencia: ");
		sb.append(this.dados.getAgencia());
		sb.append("\n");
		sb.append("Conta: ");
		sb.append(this.dados.getConta());
		sb.append("\n");
		sb.append("Saldo: ");
		sb.append(this.dados.getSaldo());
		sb.append("\n");
		return sb.toString();
	}

	@Override
	protected String getCabecalho() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Empresa de relatórios");
		sb.append("\n");
		sb.append("Relatório do Gerente");
		return sb.toString();
	}

}
