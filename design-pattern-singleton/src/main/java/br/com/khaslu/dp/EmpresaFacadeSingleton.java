package br.com.khaslu.dp;

import java.util.Objects;

public final class EmpresaFacadeSingleton {

	private static EmpresaFacade empresaFacade;

	private EmpresaFacadeSingleton() {}

	public static final EmpresaFacade getInstance() {

		if (Objects.isNull(EmpresaFacadeSingleton.empresaFacade)) {
			EmpresaFacadeSingleton.empresaFacade = new EmpresaFacade();
		}
		return EmpresaFacadeSingleton.empresaFacade;
	}
}
