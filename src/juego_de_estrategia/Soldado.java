package juego_de_estrategia;

public class Soldado extends Unidad implements IPocion{
	private Integer energia;
	
	public Soldado(Punto posicion) {
		super(posicion, 200, 10);
		this.setEnergia(100);
	}
	
	@Override
	public void atacar(Unidad unidadAAtacar) {
		if(this.getPosicion().calcularDistancia(unidadAAtacar.getPosicion()) == 1) {
			if(this.getEnergia() >= 10) {
				this.setEnergia(this.getEnergia() - 10);
				super.atacar(unidadAAtacar);	
			}
		}
	}
	
	public void darPocion() {
		this.setEnergia(100);
	}
	
	//////

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}

}
