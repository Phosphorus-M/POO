import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Natural implements Comparable<Natural>{

	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Natural(Integer valor) {
		this.setValor(valor);
	}

	public static LinkedList<Natural> getNaturales(String nombreDelArchivo) {
		Scanner sc = null;
		LinkedList<Natural> naturales = new LinkedList<>();
		try {
			sc = new Scanner(new File(nombreDelArchivo));
			while (sc.hasNextLine()) naturales.add(new Natural(Integer.parseInt(sc.nextLine())));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			if (sc != null) sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return naturales;
	}

	public static void listarOrdenadoXjuan(LinkedList<Natural> naturales) {
		Collections.sort(naturales);
		for(Natural natural:naturales) System.out.println(natural.getValor());
	}

	public Boolean esPar() {
		return this.getValor() % 2 == 0;
	}

	public int compareTo(Natural natu2) {
		if (this.esPar() && !natu2.esPar()) return -1;
		if (!this.esPar() && natu2.esPar())	return 1;
		return this.getValor().compareTo(natu2.getValor());
	}

	public static void main(String[] args) {
		Natural.listarOrdenadoXjuan(Natural.getNaturales(".//src//objetos2017//Final//2017 Diciembre Segundo llamado//naturales.in"));
	}
}
