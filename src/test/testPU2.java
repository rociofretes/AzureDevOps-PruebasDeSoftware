package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import avion.AvionComputarizado;
import copControl.Mapa;
import copControl.Posicion;

public class testPU2 {
	Mapa mapaDeMovimiento;
	AvionComputarizado avion;
	Posicion posicionIni, unaPosicion;
	
	@Before
	public void setUp() throws Exception{
		mapaDeMovimiento = new Mapa();
		posicionIni = new Posicion (10, 10);
		avion = new AvionComputarizado(posicionIni, mapaDeMovimiento);
		unaPosicion = new Posicion (10, 10);
	}
	
	@Test
	public void testPosicionNoContenida() {
		assertTrue("Posicion no contenida", avion.esPosicionContenida(unaPosicion));
	}
	

}
