package br.com.khaslu.dp;

import java.io.IOException;

public class MapaTeste {
	
	public static void main(final String[] args) throws IOException {

		final Mapa mapa = MapaFactory.getInstance();
		System.out.println(mapa.devolveMapa("Vila Albertina"));
	}
}
