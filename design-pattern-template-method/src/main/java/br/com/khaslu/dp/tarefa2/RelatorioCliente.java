package br.com.khaslu.dp.tarefa2;

public class RelatorioCliente extends AbstractRelatorio {

	@Override
	protected String getRodape() {
		final StringBuilder sb = new StringBuilder();
		sb.append("2016");
		sb.append("\n");
		sb.append("São Paulo");
		return sb.toString();
	}

	@Override
	protected String getCorpo() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(this.dados.getNome());
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
		sb.append("Relatório do Cliente");
		return sb.toString();
	}

}
