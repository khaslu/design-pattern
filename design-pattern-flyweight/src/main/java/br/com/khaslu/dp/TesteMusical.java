package br.com.khaslu.dp;

import java.util.ArrayList;
import java.util.List;

public class TesteMusical {
	public static void main(final String[] args) {
		final NotasMusicais notasMusicais = new NotasMusicais();

		final List<Nota> notas = new ArrayList<>();
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.DO));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.MI));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));

		notas.add(notasMusicais.get(NotasMusicais.NotaNome.DO));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.DO));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE));

		notas.add(notasMusicais.get(NotasMusicais.NotaNome.DO));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.SOL));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.MI));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.MI));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.MI));

		notas.add(notasMusicais.get(NotasMusicais.NotaNome.DO));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.MI));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA));

		notas.add(notasMusicais.get(NotasMusicais.NotaNome.DO_SHARP));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.RE_SHARP));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.MI_SHARP));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.FA_SHARP));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.SOL_SHARP));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.LA_SHARP));
		notas.add(notasMusicais.get(NotasMusicais.NotaNome.SI_SHARP));
		new Tocar(notas).play();
	}
}
