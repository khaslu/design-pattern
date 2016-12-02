package br.com.khaslu.dp;

public class PreFixadaVisitor implements Visitor {
	
	@Override
	public void visitar(final Soma expressao) {

		System.out.print("+ ");
		System.out.print("( ");
		expressao.getExpressao1().aceita(this);
		System.out.print(" ");
		expressao.getExpressao2().aceita(this);
		System.out.print(" )");

	}
	
	@Override
	public void visitar(final Subtracao expressao) {

		System.out.print("- ");
		System.out.print("( ");
		expressao.getExpressao1().aceita(this);
		System.out.print(" ");
		expressao.getExpressao2().aceita(this);
		System.out.print(" )");

	}
	
	@Override
	public void visitar(final Divisao expressao) {

		System.out.print("/ ");
		System.out.print("( ");
		expressao.getExpressao1().aceita(this);
		System.out.print(" ");
		expressao.getExpressao2().aceita(this);
		System.out.print(" )");

	}
	
	@Override
	public void visitar(final Multiplicacao expressao) {

		System.out.print("* ");
		System.out.print("( ");
		expressao.getExpressao1().aceita(this);
		System.out.print(" ");
		expressao.getExpressao2().aceita(this);
		System.out.print(" )");

	}
	
	@Override
	public void visitar(final RaizQuadrada expressao) {

		System.out.print("√");
		expressao.getExpressao1().aceita(this);

	}
	
	@Override
	public void visitar(final Numero expressao) {

		System.out.print(expressao.getNumero());

	}
}
