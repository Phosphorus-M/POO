import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	ArrayList<Libro> libros;
	ArrayList<Revista> revistas;
	ArrayList<Autor> autores;

	public Biblioteca(String rutaDeLosAutores, String rutaDeEntrada, String rutaDeSalida) {
		iniciarLista();
		cargarAutores(rutaDeLosAutores);
		cargarLibros(rutaDeEntrada);
		crearSalida(rutaDeSalida);
	}

	private String devolverGenerico(Publicacion a) {
		return a.getTitulo() + " " + this.autores.get(a.getAutor()-1).retornarNombreCompleto() + " " + a.retornarPrestado();
	}


	private void crearSalida(String rutaDeSalida) {
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new File(rutaDeSalida));
			int numeroDeWeas = libros.size()+ revistas.size();
			pw.println(numeroDeWeas);
			ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
			publicaciones.addAll(libros);
			publicaciones.addAll(revistas);
			int x = 1;
			for(Publicacion a:publicaciones) {
				x++;
				pw.println(x + " 		"+ this.devolverGenerico(a));
			}
			pw.println();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (pw != null) {
			try {
				pw.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	private void iniciarLista() {
		this.libros = new ArrayList<Libro>();
		this.revistas = new ArrayList<Revista>();
		this.autores = new ArrayList<Autor>();
	}

	private void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	private void agregarRevista(Revista revista) {
		this.revistas.add(revista);
	}
	private void agregarAutor(Autor autores) {
		this.autores.add(autores);
	}
	private void cargarAutores(String rutaDeLosAutores) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(rutaDeLosAutores));
			Integer x = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < x; i++) {
				String[] lineas = sc.nextLine().split(" ");
				this.agregarAutor(new Autor(Integer.parseInt(lineas[0]), lineas[1], lineas[2],  lineas[3]));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		if (sc != null) {
			try {
				sc.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	private void cargarLibros(String rutaDeEntrada) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(rutaDeEntrada));
			Integer x = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < x; i++) {
				String[] lineas = sc.nextLine().split(" ");
				this.agregarLibro(new Libro(Long.parseLong(lineas[0]), Integer.parseInt(lineas[1]), Integer.parseInt(lineas[2]), lineas[3], Integer.parseInt(lineas[4]), Integer.parseInt(lineas[5])));
			}
			x = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < x; i++) {
				String[] lineas = sc.nextLine().split(" ");
				this.agregarRevista(new Revista(lineas[0], Integer.parseInt(lineas[1]), Integer.parseInt(lineas[2]), lineas[3], Integer.parseInt(lineas[4]), Integer.parseInt(lineas[5])));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		if (sc != null) {
			try {
				sc.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		Biblioteca a = new Biblioteca(".//src//objetos2017//PC//POO1//Parcial Nº2//autores.in",
		 															".//src//objetos2017//PC//POO1//Parcial Nº2//biblioteca.in",
																	".//src//objetos2017//PC//POO1//Parcial Nº2//biblioteca.out");
	}
}
