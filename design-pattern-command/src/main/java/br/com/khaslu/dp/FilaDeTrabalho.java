package br.com.khaslu.dp;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {
	
	private final List<Comando> comandos;

	public FilaDeTrabalho() {
		this.comandos = new ArrayList<>();
	}
	
	public void adiciona(final Comando comando) {
		
		this.comandos.add(comando);
	}

	public void processa() {
		
		this.comandos.forEach(Comando::executa);
	}
}
