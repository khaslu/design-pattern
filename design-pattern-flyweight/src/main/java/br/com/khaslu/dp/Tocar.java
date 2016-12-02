package br.com.khaslu.dp;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.jfugue.player.Player;

public class Tocar {

	private final List<Nota> notas;

	public Tocar(final List<Nota> notas) {
		this.notas = notas;
	}

	public void play() {
		new Player().play(StringUtils.join(this.notas.stream().map(Nota::simbolo).collect(Collectors.toList()), " "));
	}

}
