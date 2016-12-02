package br.com.khaslu.dp;

public class Estado<T> {
	private T objeto;

	public Estado(final T objeto) {
		this.objeto = objeto;
	}

	public T getObjeto() {
		return this.objeto;
	}

	public void setObjeto(final T objeto) {
		this.objeto = objeto;
	}

}
