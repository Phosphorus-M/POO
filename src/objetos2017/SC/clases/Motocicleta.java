/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 21/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;

public class Motocicleta extends Vehiculo{
	private Persona acompanante;

	public Motocicleta(){
		super();
	}

	private String getAcompanante() {
		return acompanante.getNombre();
	}
	public Boolean cambiarChofer(Persona Chofer) {
		if(this.hayAcompanante()) return Boolean.FALSE;
		super.cambiarChofer(Chofer);
		return Boolean.TRUE;
	}
	public Boolean hayAcompanante() {
		return this.getAcompanante()!=null;
	}
	public static void main(String[] args) {
		Motocicleta Yamaha = new Motocicleta();
		Yamaha.setChofer(new Persona("Calenton"));
		Yamaha.acompanante = new Persona("Amigo del Calenton");
		Yamaha.setCantidadDeKilometros(3.5);
		System.out.println("Chofer: " + Yamaha.getChofer() +" Acompañante: " + Yamaha.getAcompanante() + " Kilometros recorridos: "+ Yamaha.getCantidadDeKilometros());
		Yamaha.cambiarChofer(new Persona("Miguel"));
		System.out.println("Chofer: " + Yamaha.getChofer() +" Acompañante: " + Yamaha.getAcompanante() + " Kilometros recorridos: "+ Yamaha.getCantidadDeKilometros());
	}
}
