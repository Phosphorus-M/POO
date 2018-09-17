/**
 * @author: Fabian Zacarola
 * @version: v1.0 10/09/2017
 * @see <a href="https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

import java.util.Scanner;
import java.io.File;

public class ArchivoTunning {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("./Archivos/Para leer/Lista.txt"));
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			s.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}