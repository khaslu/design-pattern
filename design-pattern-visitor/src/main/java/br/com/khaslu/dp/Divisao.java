package br.com.khaslu.dp;

public class Divisao extends AbstractExpressaoDupla {
	
	public Divisao(final Expressao expressao1, final Expressao expressao2) {
		super(expressao1, expressao2);
	}

	@Override
	public Double calcular() {
		
		return this.getExpressao1().calcular() / this.getExpressao2().calcular();
	}
	
	@Override
	public void aceita(final Visitor visitor) {

		visitor.visitar(this);

	}
	
}
