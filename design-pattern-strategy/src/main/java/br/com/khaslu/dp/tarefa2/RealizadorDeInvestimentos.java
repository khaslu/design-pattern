package br.com.khaslu.dp.tarefa2;

public class RealizadorDeInvestimentos {
	public void realizarInvestimento(final Conta conta, final Investimento investimento) {
		double lucro = investimento.investir(conta.getSaldo());
		lucro = lucro * 0.75;
		System.out.println(lucro);
	}
}
