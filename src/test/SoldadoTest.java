package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import juego_de_estrategia.Punto;
import juego_de_estrategia.Soldado;

public class SoldadoTest {

	@Test
	public void soldadoAtacandoAOtroSoldado() {
		Soldado unidad1 = new Soldado(new Punto(0,1));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(190));
		Assert.assertEquals(unidad1.getEnergia(), new Integer(90));
	}
	
	@Test
	public void soldadoAtacandoAOtroSoldadoYLeDoyPocion() {
		Soldado unidad1 = new Soldado(new Punto(0,1));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(190));
		unidad1.darPocion();
		Assert.assertEquals(unidad1.getEnergia(), new Integer(100));
	}
	
	@Test
	public void soldadoAtacandoAOtroSoldadoADistancia() {
		Soldado unidad1 = new Soldado(new Punto(0,20));
		Soldado unidad2 = new Soldado(new Punto(1,1));
		
		unidad1.atacar(unidad2);
		
		Assert.assertEquals(unidad2.getSalud(), new Integer(200));
		Assert.assertEquals(unidad1.getEnergia(), new Integer(100));
	}

}
