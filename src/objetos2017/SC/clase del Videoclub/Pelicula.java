
public class Pelicula implements Entregable {
	private String title;
	private Integer year;
	private Boolean gived;
	private String genere;
	private String director;


	public Pelicula() {
		this.setTitle("");
		this.setYear(0000);
		this.gived = Boolean.FALSE;
		this.setGenere("");
		this.setDirector("No definido");
	}
	public Pelicula(String title, Integer year, String genere, String director) {
		this.setTitle(title);
		this.setYear(year);
		this.gived = Boolean.FALSE;
		this.setGenere(genere);
		this.setDirector(director);
	}
	public Pelicula(String title, String director) {
		this.setTitle(title);
		this.setYear(0000);
		this.gived = Boolean.FALSE;
		this.setGenere("");
		this.setDirector(director);
	}

	public String getTitle() {
		return title;
	}
	public void prestar() {
		this.gived = Boolean.TRUE;
	}
	public void devolver() {
		this.gived = Boolean.FALSE;
	}
	public Boolean isEntregado() {
		return this.gived;
	}
	public Integer compareTo(Object a) {
		Pelicula other = (Pelicula) a;
		return this.getYear().compareTo(other.getYear());
	}

	public String toString() {
		return "( Titulo: " + this.getTitle() + "\nAno: " + this.getYear() + "\nEntregado: " + this.conseguirEntregable() + "\nGenero: " + this.getGenere() + "\nDirector: " + this.getDirector() + ")";
	}
	public String conseguirEntregable(){
		if(this.isEntregado()) return "Entregado.";
		return "No entregado.";
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


}
