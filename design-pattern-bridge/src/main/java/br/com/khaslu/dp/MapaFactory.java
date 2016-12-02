package br.com.khaslu.dp;

public class MapaFactory {

	private MapaFactory() {}
	
	public static final Mapa getInstance() {

		return new GoogleMaps();
	}
}
