package br.com.khaslu.dp;

import java.io.IOException;
import java.util.Calendar;

public class RelogioTeste {
	
	public static void main(final String[] args) throws IOException {

		final Relogio<Calendar> relogio = new CalendarRelogio();
		System.out.println(relogio.hoje());
	}
}
