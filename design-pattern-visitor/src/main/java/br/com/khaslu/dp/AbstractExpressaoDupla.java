package br.com.khaslu.dp;

public abstract class AbstractExpressaoDupla implements Expressao {

	private Expressao expressao1;

	private Expressao expressao2;

	public AbstractExpressaoDupla(final Expressao expressao1, final Expressao expressao2) {
		this.expressao1 = expressao1;
		this.expressao2 = expressao2;
	}

	@Override
	public abstract Double calcular();

	@Override
	public abstract void aceita(final Visitor visitor);
	
	public Expressao getExpressao1() {

		return this.expressao1;
	}
	
	public void setExpressao1(final Expressao expressao1) {

		this.expressao1 = expressao1;
	}
	
	public Expressao getExpressao2() {

		return this.expressao2;
	}
	
	public void setExpressao2(final Expressao expressao2) {

		this.expressao2 = expressao2;
	}

}
