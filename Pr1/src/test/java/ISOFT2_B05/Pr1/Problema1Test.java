package ISOFT2_B05.Pr1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class Problema1Test {
	
	@Test
	public void crearFecha() {
		try {
			Problema1 pObj = new Problema1(2000, 7, 8);
		}catch(IllegalArgumentException e) {
			fail("error al introducir los valores del año mes y día");
		}
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void crearFechaIncorrecta() {
		Problema1 pObj = new Problema1(2000, -10, 16);
	}
	
	
	
	@Test
	public void actualizarFecha() {
		Problema1 pObj = new Problema1(2000, 7, 8);
		
		try {
			pObj.setFecha(2007, 9, 16);
		}catch(IllegalArgumentException e) {
			fail("error al introducir los valores del año mes y día");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void actualizarFechaIncorrecta() {
		Problema1 pObj = new Problema1(2000, 7, 8);
	
		pObj.setFecha(-2007, 9, -16);
		
	}
	
	
	@Test
	public void bisiesto() {
		Problema1 pObj = new Problema1(2000, 7, 8);
		boolean resultado1 = pObj.es_bisiesto();
		
		assertTrue(resultado1);
		
		
		pObj.setFecha(2015, 5, 6);
		
		boolean resultado2 = pObj.es_bisiesto();
		
		assertFalse(resultado2);
	}
	
	
}
