package br.com.khaslu.dp;

import java.time.LocalDate;

public class Programa {
	public static void main(final String[] args) {
		final Historico<Contrato> historico = new Historico<>();
		final Contrato contrato = new Contrato(LocalDate.now(), "Lucas", TipoContrato.NOVO);
		historico.add(contrato.saveLocal());
		contrato.avanca();
		historico.add(contrato.saveLocal());
		contrato.avanca();
		historico.add(contrato.saveLocal());
		contrato.avanca();
		System.out.println(contrato);
		System.out.println(historico.get(0).getObjeto());
		System.out.println(historico.get(1).getObjeto());
		contrato.restore(historico.get(1));
		System.out.println(contrato);
	}
}
