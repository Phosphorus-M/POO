
public class Publicacion {
	private String titulo;
	private Integer autor;
	private Integer prestado;
	private Integer year;
	
	public Publicacion(Integer year, String titulo, Integer autor, Integer prestado) {
		this.setAutor(autor);
		this.setPrestado(prestado);
		this.setTitulo(titulo);
		this.setYear(year);
	}
	public String retornarPrestado() {
		if(prestado == 1) return "Si";
		return "No";
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAutor() {
		return autor;
	}

	public void setAutor(Integer autor) {
		this.autor = autor;
	}

	public Integer getPrestado() {
		return prestado;
	}

	public void setPrestado(Integer prestado) {
		this.prestado = prestado;
	}

	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
}
