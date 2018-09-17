
public class Test {
	public static void main(String[] args) {
		Pelicula Terminator = new Pelicula("Terminator", 1984, "Ciencia ficción", "James Cameron");
		Pelicula Piloto = new Pelicula("Donde esta el piloto", 1980, "Catástrofe", "David Zucker, Jim Abrahams");
		Pelicula Future = new Pelicula("Back to the Future", 1985 , "Ciencia ficción", "Robert Zemeckis");
		Pelicula[] peliculas = new Pelicula[3];
		Videojuego[] videojuegos = new Videojuego[3];
		Serie[] series = new Serie[3];
		peliculas[1] = Terminator;
		peliculas[0] = Piloto;
		peliculas[2] = Future;
		Videojuego Mario = new Videojuego("Mario Bros.", "Nintendo", "Plataformero", 15);
		Videojuego Fifa = new Videojuego("FIFA 17", "EA Sports", "Simulador", 999);
		Videojuego Skyrim = new Videojuego("The Elder Scrolls V: Skyrim", "Bethesda", "RPG", 150);
		videojuegos[1] = Mario;
		videojuegos[0] = Fifa;
		videojuegos[2] = Skyrim;
		Serie GOT = new Serie("Juego de tronos", 7, "Fantasía medieval, drama y aventuras", "George R. R. Martin");
		Serie IT = new Serie("The IT Crowd", 4, "Comedia", "Graham Linehan	");
		Serie SV = new Serie("Silicon Valley", 4, "Comedia", "Mike Judge");
		series[1] = GOT;
		series[0] = IT;
		series[2] = SV;
		series[1].prestar();
		videojuegos[1].prestar();
		peliculas[1].prestar();
		for(Serie cosa : series) {
			System.out.println(cosa);
		}
	
	}
	
}
