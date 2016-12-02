package br.com.khaslu.dp;

public class Calculadora {
	
	public static void main(final String[] args) {
		
		final Expressao conjunto1 = new Soma(new Numero(9), new Numero(3));
		System.out.println(conjunto1.calcular());

		final Expressao conjunto2 = new Subtracao(new Numero(9), new Numero(3));
		System.out.println(conjunto2.calcular());

		final Expressao conjunto3 = new Divisao(new Numero(9), new Numero(3));
		System.out.println(conjunto3.calcular());

		final Expressao conjunto4 = new Multiplicacao(new Numero(9), new Numero(3));
		System.out.println(conjunto4.calcular());

		final Expressao conjunto5 = new Soma(conjunto1, conjunto2);
		System.out.println(conjunto5.calcular());

		final Expressao conjunto6 = new RaizQuadrada(new Numero(9));
		System.out.println(conjunto6.calcular());

		Visitor visitor = new ImpressoraVisitor();
		visitor.visitar((Soma) conjunto5);
		System.out.println();
		visitor = new PreFixadaVisitor();
		visitor.visitar((Soma) conjunto5);
		System.out.println();
		
	}
}
