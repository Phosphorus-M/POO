package objetos2018.PC.clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Camino {
	public Camino(String baldosas) {
		
	}
	public static void main(String[] args) {
		File entrada = new File(".\\Archivos\\Para leer\\caminito.in");
		try {
			Scanner lector = new Scanner(entrada);
			char[] cosa = lector.nextLine().toCharArray();
			System.out.println(cosa);
			for(int i=0; i < cosa.length; i++) {
				
				if
				System.out.println(cosa);
			}
			System.out.println(cosa);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
