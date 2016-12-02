package br.com.khaslu.dp;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	private static final Map<String, Nota> notas = new HashMap<>();

	static {
		try {
			for (final Field field : NotaNome.class.getDeclaredFields()) {
				final String campo = (String) field.get(field);
				NotasMusicais.notas.put(campo, NotaFactory.getInstance(campo));
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public Nota get(final String nota) {
		return NotasMusicais.notas.get(nota);
	}

	interface NotaNome {
		String DO = Do.class.getSimpleName();
		String RE = Re.class.getSimpleName();
		String MI = Mi.class.getSimpleName();
		String FA = Fa.class.getSimpleName();
		String SOL = Sol.class.getSimpleName();
		String LA = La.class.getSimpleName();
		String SI = Si.class.getSimpleName();

		String DO_SHARP = DoSharp.class.getSimpleName();
		String RE_SHARP = ReSharp.class.getSimpleName();
		String MI_SHARP = MiSharp.class.getSimpleName();
		String FA_SHARP = FaSharp.class.getSimpleName();
		String SOL_SHARP = SolSharp.class.getSimpleName();
		String LA_SHARP = LaSharp.class.getSimpleName();
		String SI_SHARP = SiSharp.class.getSimpleName();
	}
}
