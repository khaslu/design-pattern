package br.com.khaslu.dp.tarefa1;

import java.util.Objects;

public class ServicoSingleton {
	
	private static Servico servico;

	private ServicoSingleton() {}

	public static final Servico getInstance() {
		
		if (Objects.isNull(ServicoSingleton.servico)) {
			ServicoSingleton.servico = new Servico();
		}
		return ServicoSingleton.servico;
	}
}
