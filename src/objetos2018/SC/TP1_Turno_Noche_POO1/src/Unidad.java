public abstract class Unidad  {
	private Integer salud;
	private Integer danio;
	private Punto posicionEnElTablero;
	private Integer rangoMinimoDeAtaque;
	private Integer rangoMaximoDeAtaque;
	private Boolean estaVivo;
	
	public Unidad(Integer danio, Punto posicionEnElTablero, Integer rangoMaximoDeAtaque, 
				Integer rangoMinimoDeAtaque, Integer salud) {
					this.setDanio(danio);
					this.setPosicionEnElTablero(posicionEnElTablero);
					this.setRangoMaximoDeAtaque(rangoMaximoDeAtaque);
					this.setRangoMinimoDeAtaque(rangoMinimoDeAtaque);
					this.setSalud(salud);
					this.setEstaVivo(true);
	}

	public Boolean getEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(Boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public Integer getDanio() {
		return danio;
	}

	public void setDanio(Integer danio) {
		this.danio = danio;
	}

	public Punto getPosicionEnElTablero() {
		return posicionEnElTablero;
	}

	public void setPosicionEnElTablero(Punto posicionEnElTablero) {
		this.posicionEnElTablero = posicionEnElTablero;
	}

	public Integer getRangoMinimoDeAtaque() {
		return rangoMinimoDeAtaque;
	}

	public void setRangoMinimoDeAtaque(Integer rangoMinimoDeAtaque) {
		this.rangoMinimoDeAtaque = rangoMinimoDeAtaque;
	}

	public Integer getRangoMaximoDeAtaque() {
		return rangoMaximoDeAtaque;
	}

	public void setRangoMaximoDeAtaque(Integer rangoMaximoDeAtaque) {
		this.rangoMaximoDeAtaque = rangoMaximoDeAtaque;
	}
	
	
	public void atacar(Unidad unidadAAtacar) {
		if (this.equals(unidadAAtacar)) return;
		if (this.getPosicionEnElTablero().calcularDistancia(unidadAAtacar.getPosicionEnElTablero()) <= this.getRangoMaximoDeAtaque()
				&& this.getPosicionEnElTablero().calcularDistancia(unidadAAtacar.getPosicionEnElTablero()) >= this.getRangoMinimoDeAtaque())
		{
			
			if (this.getEstaVivo() == true && unidadAAtacar.getEstaVivo() == true) {
				unidadAAtacar.setSalud(unidadAAtacar.getSalud() - this.getDanio());
				System.out.println("La unidad atacada ahora tiene " + unidadAAtacar.getSalud() + " puntos de vida. Ha recibido " + this.getDanio() + " puntos de daño");
				if (unidadAAtacar.getSalud() <= 0) {
					unidadAAtacar.setEstaVivo(false);
					System.out.println("La unidad atacada ha muerto");
					unidadAAtacar.setSalud(0);
				}
				
			}else System.out.println("Alguna de las dos unidades estan muertas y no puede ejecutarse el ataque, eso es vil atacar a un debilitado.");
			
		}else System.out.println("El rango que tiene el atacante es insuficiente puede atacar a un minimo de " + this.getRangoMinimoDeAtaque()
						+ " de casillas y un maximo de " + this.getRangoMaximoDeAtaque() + " casillas.\nLa unidad atacante esta en " 
						+ this.getPosicionEnElTablero().getPosicionEnX() + " de X y " + this.getPosicionEnElTablero().getPosicionEnY()
						+ " en Y, mientras que la unidad atacada esta en la casilla " + unidadAAtacar.getPosicionEnElTablero().getPosicionEnX()
						+ " en X y " + unidadAAtacar.getPosicionEnElTablero().getPosicionEnY() + " en Y.");
		
	}
	
	
}
