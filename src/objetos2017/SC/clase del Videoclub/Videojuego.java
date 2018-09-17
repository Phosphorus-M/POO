public class Videojuego implements Entregable{
	private String title;
	private String company;
	private String genere;
	private Integer hours;
	private Boolean gived;

	public Videojuego() {
		
		this.setTitle("");
		this.setCompany("");
		this.setGenere("");
		this.setHours(10);
		this.setEntregado(Boolean.FALSE);
	}

	public Videojuego(String titulo, Integer horasEstimadas) {
		this.setTitle(titulo);
		this.setHours(horasEstimadas);
	}
	
	public Videojuego(String titulo, String compañia, String genero, Integer horasEstimadas) {
		
		this.setTitle(titulo);
		this.setCompany(compañia);
		this.setGenere(genero);
		this.setHours(horasEstimadas);	
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String titulo) {
		this.title = titulo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genero) {
		this.genere = genero;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer horasEstimadas) {
		this.hours = horasEstimadas;
	}

	public Boolean getEntregado() {
		return gived;
	}

	public void setEntregado(Boolean entregado) {
		this.gived = entregado;
	}

	public void prestar() {
		this.setEntregado(Boolean.TRUE);
	}

	public void devolver() {
		this.setEntregado(Boolean.FALSE);
	}

	public Boolean isEntregado() {
		return this.gived;
	}

	public Integer compareTo(Object a) {
		Videojuego other = (Videojuego) a;
		return this.getHours().compareTo(other.getHours());
	}
	public String conseguirEntregable(){
		if(this.isEntregado()) return "Entregado.";
		return "No entregado.";
	}
	public String toString() {
		return "( Titulo: " + this.getTitle() + "\nHoras estimadas: " + this.getHours() + "\nEntregado: " + this.conseguirEntregable() + "\nGenero: " + this.getGenere() + "\nCompañia: " + this.getCompany() + ")"; 
	}

}