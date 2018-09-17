/**
 * Imprimir por pantalla los números del 1 al 100 pero considerando lo siguiente:
 * Si el número es divisible por 3 se debe imprimir “Fizz”.
 * Si el número es divisible por 5 se debe imprimir “Buzz”.
 * Si el número es divisible por 3 y por 5 se debe imprimir “FizzBuzz”.
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 1/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=0;i<=100;i++){
			System.out.println("El numero i es: " + i);
			if((i%3)==0) {
				System.out.println("Fizz");
			}
			if((i%5)==0) {
				System.out.println("Buzz");
			}
			if((i%5)==0 && (i%3 == 0 )) {
				System.out.println("FizzBuzz");
			}
		}
	}
}
