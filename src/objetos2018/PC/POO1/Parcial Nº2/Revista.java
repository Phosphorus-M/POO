
public class Revista extends Publicacion{
	private String coleccion;
	private Integer numeroDePublicacion;

	
	public Revista(String coleccion, Integer numeroDePublicacion, Integer year, String titulo, Integer autor, Integer prestado) {
		super(year, titulo, autor, prestado);
		this.setColeccion(coleccion);
		this.setNumeroDePublicacion(numeroDePublicacion);
	}


	public String getColeccion() {
		return coleccion;
	}


	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}


	public Integer getNumeroDePublicacion() {
		return numeroDePublicacion;
	}


	public void setNumeroDePublicacion(Integer numeroDePublicacion) {
		this.numeroDePublicacion = numeroDePublicacion;
	}
}
