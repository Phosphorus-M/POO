
public class Caballero extends Unidad implements PocionDeAgua{
	private Integer contCaballo;
	private Boolean caballoRebelde;
	
	public Caballero(Punto posicionEnElTablero) {
		super(50, posicionEnElTablero, 2, 1, 200);
		this.setContCaballo(0);
		this.setCaballoRebelde(false);
	}
	
	
	

	public Integer getContCaballo() {
		return contCaballo;
	}

	public void setContCaballo(Integer contCaballo) {
		this.contCaballo = contCaballo;
	}

	public Boolean getCaballoRebelde() {
		return caballoRebelde;
	}

	public void setCaballoRebelde(Boolean caballoRebelde) {
		this.caballoRebelde = caballoRebelde;
	}
	
	@Override
	public void atacar(Unidad unidadAAtacar) {
		if (!this.getCaballoRebelde()) {
			super.atacar(unidadAAtacar);
			this.setContCaballo(this.getContCaballo() + 1);
		}else System.out.println("El caballo esta rebelde, debes calmarlo para atacar.");
		
	}

	@Override
	public void darPocionDeAgua() {
		this.setCaballoRebelde(false);
		this.setContCaballo(0);
	}
	
	
}
