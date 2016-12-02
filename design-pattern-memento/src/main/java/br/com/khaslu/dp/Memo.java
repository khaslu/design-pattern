package br.com.khaslu.dp;

public interface Memo<T> {
	Estado<T> saveLocal();

	void restore(Estado<T> estado);
}
