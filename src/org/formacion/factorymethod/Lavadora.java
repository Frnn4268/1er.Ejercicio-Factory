package org.formacion.factorymethod;

public abstract class Lavadora implements Factory{

	protected boolean tieneTambor;
	protected boolean tieneMandos;
	protected String  tipoCarga;
	
	public boolean gettieneTambor() {
		return tieneTambor;
	}
	
	public void settieneTambor(boolean tieneTambor) {
		this.tieneTambor = tieneTambor;
	}
	
	public boolean gettieneMandos() {
		return tieneMandos;
	}
	
	public void settieneMandos(boolean tieneMandos) {
		this.tieneMandos = tieneMandos;
	}
	
	public String gettipoCarga() {
		return tipoCarga;
	}
	
	public void settipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	
	public void ponerTambor() {
		tieneTambor = true;
	}
	
	public void ponerMandos() {
		tieneMandos = true;
	}

}
