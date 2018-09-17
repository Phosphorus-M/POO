/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 21/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

public class Autobus extends Vehiculo{
	private Persona[] pasajeros;
	private Integer cantidadActualDePasajeros;
	private Integer maximaCantidad;

	public Autobus(Integer MaximaDePasajeros) {
		super();
		this.maximaCantidad = MaximaDePasajeros;
		this.cantidadActualDePasajeros = 0;
		this.pasajeros = new Persona[this.maximaCantidad];
	}
	public Boolean cambiarChofer(Persona Chofer) {
		if(this.hayPasajeros()) return Boolean.FALSE;
		super.cambiarChofer(Chofer);
		return Boolean.TRUE;
	}
	public Boolean hayPasajeros() {
		return this.cantidadActualDePasajeros>0;
	}
	private void setCantidadActualDePasajeros(int i) {
		this.cantidadActualDePasajeros = i;
	}
	private int getCantidadActualDePasajeros() {
		return this.cantidadActualDePasajeros;
	}
	public Boolean setPasajeros(String nombre) {
		if(!this.hayCapacidad()) return Boolean.FALSE;
		this.pasajeros[cantidadActualDePasajeros] = new Persona(nombre);
		this.setCantidadActualDePasajeros(this.cantidadActualDePasajeros+1);
		return Boolean.TRUE;
	}
	public Boolean hayCapacidad() {
		if(this.cantidadActualDePasajeros<this.maximaCantidad) return Boolean.TRUE;
		return Boolean.FALSE;
	}
	private String getNombreDelPasajero(Integer Pasajero) {
			if(!this.hayPasajeros()) return "No hay pasajeros";
			return this.pasajeros[Pasajero-1].getNombre();
	}
	public static void main(String[] args) {
		Autobus LaPerlita = new Autobus(3);
		System.out.println(LaPerlita.getCantidadActualDePasajeros());
		System.out.println(LaPerlita.getNombreDelPasajero(LaPerlita.getCantidadActualDePasajeros()));
		LaPerlita.setPasajeros("Juan");
		System.out.println(LaPerlita.getCantidadActualDePasajeros());
		System.out.println(LaPerlita.getNombreDelPasajero(LaPerlita.getCantidadActualDePasajeros()));
		LaPerlita.setPasajeros("Miguel");
		System.out.println(LaPerlita.getCantidadActualDePasajeros());
		System.out.println(LaPerlita.getNombreDelPasajero(LaPerlita.getCantidadActualDePasajeros()));
		LaPerlita.setPasajeros("Pepe");
		System.out.println(LaPerlita.getCantidadActualDePasajeros());
		System.out.println(LaPerlita.getNombreDelPasajero(LaPerlita.getCantidadActualDePasajeros()));
		LaPerlita.setPasajeros("Toto");
		System.out.println(LaPerlita.getCantidadActualDePasajeros());
		System.out.println(LaPerlita.getNombreDelPasajero(LaPerlita.getCantidadActualDePasajeros()));
		LaPerlita.setCantidadDeKilometros(3.5);
	}
}
