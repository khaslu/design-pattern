package br.com.khaslu.dp;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;

public class GoogleMaps implements Mapa {
	
	@Override
	public String devolveMapa(final String rua) throws IOException {

		final URL google = new URL("https://www.google.com.br/maps?q=" + StringUtils.replace(rua, " ", "+"));
		final InputStream stream = google.openStream();
		stream.close();
		return "Rua encontrada";
	}

}
