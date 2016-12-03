package br.com.khaslu.dp;

public class ConcluiPedido implements Comando {

	private final Pedido pedido;

	public ConcluiPedido(final Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {

		System.out.println("concluído pedido: " + this.pedido.getCliente());
		this.pedido.finaliza();
	}
	
}
