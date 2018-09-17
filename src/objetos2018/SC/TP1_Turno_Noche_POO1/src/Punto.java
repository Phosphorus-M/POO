
public class Punto {
	private Integer posicionEnX;
	private Integer posicionEnY;
	
	public Punto(Integer posicionEnX, Integer posicionEnY) {
		this.setPosicionEnX(posicionEnX);
		this.setPosicionEnY(posicionEnY);
	}

	public Integer getPosicionEnX() {
		return posicionEnX;
	}

	public void setPosicionEnX(Integer posicionEnX) {
		this.posicionEnX = posicionEnX;
	}

	public Integer getPosicionEnY() {
		return posicionEnY;
	}

	public void setPosicionEnY(Integer posicionEnY) {
		this.posicionEnY = posicionEnY;
	}
	
	public double calcularDistancia(Punto punto) {
		return Math.hypot(this.getPosicionEnX() - punto.getPosicionEnX(), this.getPosicionEnY() - punto.getPosicionEnY());
	}
}
