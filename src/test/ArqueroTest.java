package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import juego_de_estrategia.Arquero;
import juego_de_estrategia.Punto;
import juego_de_estrategia.Soldado;

public class ArqueroTest {

	@Test
	public void arqueroAtacandoAOtroSoldado() {
		Arquero unidad1 = new Arquero(new Punto(3,3));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(195));
		Assert.assertEquals(unidad1.getFlechas(), new Integer(19));
	}
	
	@Test
	public void arqueroNoAtacandoAOtroSoldado() {
		Arquero unidad1 = new Arquero(new Punto(2,2));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(200));
		Assert.assertEquals(unidad1.getFlechas(), new Integer(20));
	}
	

}
