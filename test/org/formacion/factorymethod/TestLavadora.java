package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {
	
	int tipoLavadora = 1;
	int tipoLavadora1 = 2;

	@Test
	public void test_carga_frontal() {
		//implementar factory method
		Lavadora lavadora = new FactoryLavadora().getTipo(tipoLavadora);
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		//implementar factory method
		Lavadora lavadora = new FactoryLavadora().getTipo1(tipoLavadora1);
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
