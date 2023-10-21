package test;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import Inicializadores.InicializadorJuego;
import copControl.Juego;
import copControl.Jugador;

public class testPU3 {
	
	Juego juego;
	Jugador jugador;
	
	@Before
	public void setUp() throws Exception{
		jugador = new Jugador("Jugador");
		juego = InicializadorJuego.juegoInicializado();
			
	}
	
	@Test
	public void testJuegoGanado() {
		assertFalse("El juego finalizo como victoria del jugador sin siquiera comenzar", juego.esJuegoGanado());
	}

}
