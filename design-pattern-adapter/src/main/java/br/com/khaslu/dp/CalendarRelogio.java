package br.com.khaslu.dp;

import java.util.Calendar;

public class CalendarRelogio implements Relogio<Calendar> {
	
	@Override
	public Calendar hoje() {
		
		return Calendar.getInstance();
	}

}
