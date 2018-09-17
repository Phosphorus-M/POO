/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 21/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

public class Vehiculo{
	private Persona chofer;
	private Double cantidadDeKilometros;
	public Vehiculo() {
		this.setCantidadDeKilometros(0.0);
	}
	public String getChofer() {
		return this.chofer.getNombre();
	}
	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}
	public Double getCantidadDeKilometros() {
		return this.cantidadDeKilometros;
	}
	public Boolean cambiarChofer(Persona chofer) {
		this.setChofer(chofer);
		return Boolean.TRUE;
	}
	public void setCantidadDeKilometros(Double cantidadDeKilometros) {
		this.cantidadDeKilometros = cantidadDeKilometros;
	}
}
