package clases;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int valorDeX, int valorDeY){
		this.setX(valorDeX);
		this.setY(valorDeY);
		System.out.println("El valor incial es" +  valorDeX + "" + valorDeY);
	}

	public Punto() {
	}
		
	public void sumarPunto(Punto valoresASumar){
		this.x = this.x + valoresASumar.getX();
		this.y = this.y + valoresASumar.getY();
	}

	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int valorDeX) {
		System.out.println("El valor de X es " + this.x + "pero ahora va a ser" + valorDeX);
		this.x = valorDeX;
	}

}
