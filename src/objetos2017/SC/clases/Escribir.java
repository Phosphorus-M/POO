/**
 * @author: Fabian Zacarola
 * @version: v1.0 10/09/2017
 * @see <a href="https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

import java.io.PrintWriter;
import java.io.FileWriter;
public class Escribir {
	public static void main(String[] args) {
		PrintWriter p;
		try {
			p = new PrintWriter (new FileWriter(".//src//objetos2017//SC//clases//Archivos//Generados//Texto impreso - Escribir.java.txt", true));
			/* Notas de la linea anterior:
			 1 - Sirve para ubicar el archivo en el cual se va a imprimir la setencia.
			 2 - Con "True" al final de la setencia no sobreescribe sino que se agrega, si se pone False remplazara el archivo si es que existe.
			 */
			p.println ("Hola, buenos dias.");//Con el metodo println se escribe.
			p.println ("Hoy llueve.");
			p.close();
		} catch (Exception e) { //"Exception e" marca todo tipo de error.
			System.out.println(e.getMessage());//Indica donde esta el error
			e.printStackTrace();//Indica donde estan los errores.
		}
	}
}
