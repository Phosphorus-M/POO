package juego_de_estrategia;

public abstract class Unidad {
	private Punto posicion;
	private Integer salud;
	private Integer damage;
	
	public Unidad(Punto posicion, Integer salud, Integer damage) {
		this.setDamage(damage);
		this.setPosicion(posicion);
		this.setSalud(salud);
	}
	
	public void atacar(Unidad unidadAAtacar) {
		if(unidadAAtacar.getSalud() > 0) { 
			unidadAAtacar.setSalud(unidadAAtacar.getSalud() - this.getDamage());
		}else {
			System.out.println("No podes atacar a un muerto");
		}
	}
	
	
	////////
	
	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	
	
	
}
