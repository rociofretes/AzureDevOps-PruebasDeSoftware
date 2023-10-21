package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import copControl.Posicion;

public class testPU1 {
	Posicion p1;
	Posicion p2;
	
	@Before
	public void setUp() throws Exception{
		p1 = new Posicion (10, 10);
		p2 = new Posicion (10, 10);
	}
	
	@Test
	public void testPosicionIgual() {
		assertTrue(p1.igualA(p2));
	}

}
