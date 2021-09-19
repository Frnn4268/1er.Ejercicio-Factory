package org.formacion.factorymethod;

public class FactoryLavadora {

	public Lavadora getTipo(int tipoLav) {
		return new LavadoraCargaFrontal();
	}
	
	public Lavadora getTipo1(int tipoLav) {
		return new LavadoraCargaSuperior();
	}
}
