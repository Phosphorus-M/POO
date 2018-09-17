
public class Soldado extends Unidad implements PocionDeAgua{
	private Integer energia;
	
	
	public Soldado(Punto posicionEnElTablero) {
		super(10, posicionEnElTablero, 1, 0, 200);
		this.setEnergia(100);
	}


	public Integer getEnergia() {
		return energia;
	}


	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	public void atacar(Unidad unidadAAtacar) {
		if (this.getEnergia() > 0) {
			this.setEnergia(this.getEnergia()-10);
			super.atacar(unidadAAtacar);
			System.out.println("El soldado atacante piede 10 puntos de energia.");
		}else System.out.println("No tiene energia suficiente para atacar.");
	}

	@Override
	public void darPocionDeAgua() {
		this.setEnergia(this.getEnergia() + 10);
	}
	
}
