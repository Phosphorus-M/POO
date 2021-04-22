package juego_de_estrategia;

public class Lancero extends Unidad{

	public Lancero(Punto posicion) {
		super(posicion, 150, 25);
	}
	
	@Override
	public void atacar(Unidad unidadAAtacar) {
		Double lejania = this.getPosicion().calcularDistancia(unidadAAtacar.getPosicion());
		if(lejania >= 1 && lejania <= 3) {
			super.atacar(unidadAAtacar);
		}
	}
	
}
