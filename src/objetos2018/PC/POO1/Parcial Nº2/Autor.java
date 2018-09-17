
public class Autor {
	private Integer identifador; 
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Autor(Integer identificador, String nombre, String apellido, String telefono) {
		this.setApellido(apellido);
		this.setIdentifador(identificador);
		this.setNombre(nombre);
		this.setTelefono(telefono);
	}
	public String retornarNombreCompleto() {
		return this.getNombre() + " " + this.getApellido();
	}
	public Integer getIdentifador() {
		return identifador;
	}
	public void setIdentifador(Integer identifador) {
		this.identifador = identifador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
