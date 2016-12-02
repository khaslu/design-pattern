package br.com.khaslu.dp;

public class RaizQuadrada implements Expressao {
	
	private final Expressao expressao1;
	
	public RaizQuadrada(final Expressao expressao1) {
		this.expressao1 = expressao1;
	}
	
	@Override
	public Double calcular() {
		
		return Math.sqrt(this.expressao1.calcular());
	}
	
	@Override
	public void aceita(final Visitor visitor) {
		
		visitor.visitar(this);
		
	}
	
	public Expressao getExpressao1() {

		return this.expressao1;
	}
	
}
