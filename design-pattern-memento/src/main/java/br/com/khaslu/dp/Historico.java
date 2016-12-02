package br.com.khaslu.dp;

import java.util.ArrayList;
import java.util.List;

public class Historico<T> {
	private final List<Estado<T>> memo = new ArrayList<>();

	public Estado<T> get(final int index) {
		return this.memo.get(index);
	}

	public void add(final Estado<T> object) {
		this.memo.add(object);
	}
}
