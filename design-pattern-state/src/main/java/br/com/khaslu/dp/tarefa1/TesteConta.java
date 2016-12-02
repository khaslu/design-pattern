package br.com.khaslu.dp.tarefa1;

public class TesteConta {
	public static void main(final String[] args) {
		final Conta conta = new Conta(100d);

		System.out.println(conta);
		conta.sacar(200);

		System.out.println(conta);
		conta.depositar(200);

		System.out.println(conta);
		conta.depositar(200);

		System.out.println(conta);

	}
}
