package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import juego_de_estrategia.Lancero;
import juego_de_estrategia.Punto;
import juego_de_estrategia.Soldado;

public class LanceroTest {

	@Test
	public void lanceroAtacaAOtra() {
		Lancero unidad1 = new Lancero(new Punto(0,1));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(175));		
	}

	
	@Test
	public void lanceroNoAtacaAOtra() {
		Lancero unidad1 = new Lancero(new Punto(54,85));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(200));		
	}

}
