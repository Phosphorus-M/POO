package juego_de_estrategia;

public class Arquero extends Unidad{
	private Integer flechas;
	
	public Arquero(Punto posicion) {
		super(posicion, 50, 5);
		this.setFlechas(20);
	}

	public void cargarFlechas() {
		this.setFlechas(this.getFlechas() + 5);
	}
	
	@Override
	public void atacar(Unidad unidadAAtacar) {
		Double lejania = this.getPosicion().calcularDistancia(unidadAAtacar.getPosicion());
		
		if(lejania >= 2 && lejania <= 5) {
			if(this.getFlechas() > 0) {
				super.atacar(unidadAAtacar);
				this.setFlechas(this.getFlechas() - 1);
				// Es lo mismo que hacer this.flechas -= 1;  
			}
		}
	}
	
	//////
	
	public Integer getFlechas() {
		return flechas;
	}

	public void setFlechas(Integer flechas) {
		this.flechas = flechas;
	}

}
