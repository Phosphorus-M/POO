/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 21/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

public class Persona {
	private String Nombre;
	
	public Persona(String nombre){
		this.setNombre(nombre);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
