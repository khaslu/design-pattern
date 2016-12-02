package br.com.khaslu.dp;

public interface Visitor {
	
	void visitar(Soma expressao);
	
	void visitar(Subtracao expressao);
	
	void visitar(Divisao expressao);
	
	void visitar(Multiplicacao expressao);
	
	void visitar(RaizQuadrada expressao);
	
	void visitar(Numero expressao);
}
