package br.com.khaslu.dp;

public interface Expressao {
	
	Double calcular();

	void aceita(Visitor visitor);
}
