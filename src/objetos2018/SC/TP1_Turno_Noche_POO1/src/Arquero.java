
public class Arquero extends Unidad {
	private Integer flechas;
	
	public Arquero(Punto posicionEnElTablero) {
		super(5, posicionEnElTablero, 5, 2, 50);
		this.setFlechas(20);
	}

	public Integer getFlechas() {
		return flechas;
	}

	public void setFlechas(Integer flechas) {
		this.flechas = flechas;
	}
	
	@Override
	public void atacar(Unidad unidadAAtacar) {
		if (this.getFlechas() > 0) {
			 super.atacar(unidadAAtacar);
			 this.setFlechas(this.getFlechas() - 1);
		}else System.out.println("No puedes atacar, no tienes suficientes flechas.");
			
	}
	
	public void darPaquete() {
		this.setFlechas(this.getFlechas()+6);
	}
}
