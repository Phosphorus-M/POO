/**
 * Sumar los 1000 primeros números naturales (1+2+3+4+...+1000), imprimiendo por cada suma el resultado parcial obtenido.
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 1/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

public class Sumados {
	public static void main(String[] args) {
		int total=0;
		for(int i=0;i<=1000;i++) {
			total= total+i;
			System.out.println(total);
		}
	}
}
