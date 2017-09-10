/**
 * @author: Fabian Zacarola
 * @version: v1.0 10/09/2017
 * @see <a href="https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package Clases;

import java.util.Scanner;
import java.io.File;

public class SumaArchivos {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("./Archivos/Para leer/Suma.txt"));
			int cantidad = s.nextInt();//Lee la primera linea que es la que dice cuantas lineas más se van a contar
			int acumulador = 0;//Inicializa acumulador
			for (int k=0; k<cantidad; k++){//Ejecuta la cantidad de lineas que se dijo anteriormente
				acumulador = s.nextInt() + acumulador;//Suma el entero de cada linea
			}
			System.out.println(acumulador);//Imprime el resultado final
			s.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}