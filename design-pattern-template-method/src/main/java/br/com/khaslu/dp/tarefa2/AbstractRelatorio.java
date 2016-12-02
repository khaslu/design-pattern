package br.com.khaslu.dp.tarefa2;

public abstract class AbstractRelatorio implements Relatorio {

	protected Dados dados;

	@Override
	public String gerar(final Dados dados) {
		this.dados = dados;
		final StringBuilder sb = new StringBuilder();
		sb.append(this.getCabecalho());
		sb.append("\n\n");
		sb.append(this.getCorpo());
		sb.append("\n\n");
		sb.append(this.getRodape());
		return sb.toString();
	}

	protected abstract String getRodape();

	protected abstract String getCorpo();

	protected abstract String getCabecalho();

}
