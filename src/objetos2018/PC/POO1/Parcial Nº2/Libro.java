
public class Libro extends Publicacion{

	private Long isbn;

	private Integer clasification;

	public Libro(Long isbn, Integer clasifcation, Integer year, String titulo, Integer autor, Integer prestado) {
		super(year, titulo, autor, prestado);
		this.setClasification(clasifcation);
		this.setISBN(isbn);
	}

	public Long getISBN() {
		return isbn;
	}

	public String devolverCategoria() {
		switch(this.getClasification()) {
			case 000: return "Ciencias de la computacion, informacion y tratados generales";
			case 500: return "Ciencias exactas";
			case 600: return "Tecnologia";
			case 900: return "Historia y geografia";
			default: return "Categoria invalida";
		}
	}

	public String devolverAntiguo() {
		if(this.getYear() < 1994) return "Antiguo";
		return "";
	}

	public void setISBN(Long isbn) {
		this.isbn = isbn;
	}

	public Integer getClasification() {
		return clasification;
	}
	public void setClasification(Integer clasification) {
		this.clasification = clasification;
	}




}
