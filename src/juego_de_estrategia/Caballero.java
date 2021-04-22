package juego_de_estrategia;

public class Caballero extends Unidad implements IPocion{
	private Integer contadorCaballo;
	
	public Caballero(Punto posicion) {
		super(posicion, 200, 50);
	}

	@Override
	public void atacar(Unidad unidadAAtacar) {
		Double lejania = this.getPosicion().calcularDistancia(unidadAAtacar.getPosicion());

		if(this.getContadorCaballo() < 3) {
			if(lejania >= 1 && lejania <= 2) {
				super.atacar(unidadAAtacar);
				this.setContadorCaballo(this.getContadorCaballo() + 1);
			}
		}else System.out.println("Caballo rebelde");
	}

	@Override
	public void darPocion() {
		this.contadorCaballo = 0;
	}
	
	
	///
	
	
	public Integer getContadorCaballo() {
		return contadorCaballo;
	}

	public void setContadorCaballo(Integer contadorCaballo) {
		this.contadorCaballo = contadorCaballo;
	}

	
	
}
