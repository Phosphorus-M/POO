/**
 * Defina una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano. Defina un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos. Para probar esta funcionalidad, escriba un método main en el que se creen dos puntos, el primero de los cuales deberá tener las coordenadas 100.0, 200.0 y el segundo deberá tener las coordenadas 400.0, 800.0 y calcule e imprima la distancia entre ambos.
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 1/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package Clases;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto() {
		this(0.0, 0.0);
	}
	
	public Punto(double xy) {
		this(xy, xy);
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public static double calcularDistanciaEntreDosPuntos(Punto punto1, Punto punto2) {
		return Math.hypot(punto1.getX() - punto2.getX(), punto1.getY() - punto2.getY());
	}
	
	public double calcularDistanciaEntreDosPuntos(Punto punto1) {
		return Punto.calcularDistanciaEntreDosPuntos(this, punto1);
	}
	
	public String toString() {
		return this.getX() + "," + this.getY();
	}
	public static void main(String[] args) {
		Punto Arriba = new Punto(100,200);
		Punto Abajo = new Punto(400,800);
		System.out.println(Arriba.calcularDistanciaEntreDosPuntos(Abajo));
		System.out.println(calcularDistanciaEntreDosPuntos(Arriba, Abajo));
	}
}
