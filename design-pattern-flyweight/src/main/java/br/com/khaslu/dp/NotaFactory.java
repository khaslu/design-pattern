package br.com.khaslu.dp;

public class NotaFactory {

	@SuppressWarnings("unchecked")
	public static final Nota getInstance(final String nota)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		final String pacote = NotaFactory.class.getPackage().getName();
		String classe = nota;
		classe = pacote.concat(".").concat(classe);
		final Class<Nota> instancia = (Class<Nota>) Class.forName(classe);
		return instancia.newInstance();

	}
}
