package br.com.khaslu.dp;

public class PagaPedido implements Comando {

	private final Pedido pedido;

	public PagaPedido(final Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {

		System.out.println("Pago pedido: " + this.pedido.getCliente());
		this.pedido.paga();
	}
	
}
