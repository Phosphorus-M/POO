package ejercicio;

public class Alumno {
	private Integer matricula;
	private Integer nota;
	private String nombre;
	
	// Constructores
	public Alumno(Integer matricula, String nombre) {
		this.setMatricula(matricula);
		this.setNombre(nombre);
	}
	public Alumno(Integer matricula, Integer nota, String nombre) {
		this.setMatricula(matricula);
		this.setNombre(nombre);
		this.setNota(nota);
	}
	
	//Getters y Setters
	public String toString() {
		return "El alumno es: " + this.getNombre()+ " Matricula: " + this.getMatricula() + " Nota: " +this.getNota() ;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public Integer getMatricula() {
		return this.matricula;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public Integer getNota() {
		return this.nota;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}	
	
}
