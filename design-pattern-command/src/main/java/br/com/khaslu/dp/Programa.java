package br.com.khaslu.dp;

public class Programa {

	public static void main(final String[] args) {

		final Pedido pedido1 = new Pedido("Lucas", 350.00);
		final Pedido pedido2 = new Pedido("Murilo", 550.00);

		final FilaDeTrabalho fila = new FilaDeTrabalho();
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido1));
		fila.processa();
	}
}
