/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 21/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package Clases;

public class Motocicleta extends Vehiculo{
	private Persona acompañante;
		
	public Motocicleta(){
		super();
	}
	
	private String getAcompañante() {
		return acompañante.getNombre();
	}
	public Boolean cambiarChofer(Persona Chofer) {
		if(this.hayAcompañante()) return Boolean.FALSE;
		super.cambiarChofer(Chofer);
		return Boolean.TRUE;
	}
	public Boolean hayAcompañante() {
		return this.getAcompañante()!=null;
	}
	public static void main(String[] args) {
		Motocicleta Yamaha = new Motocicleta();
		Yamaha.setChofer(new Persona("Calenton"));
		Yamaha.acompañante = new Persona("Amigo del Calenton");
		Yamaha.setCantidadDeKilometros(3.5);
		System.out.println("Chofer: " + Yamaha.getChofer() +" Acompañante: " + Yamaha.getAcompañante() + " Kilometros recorridos: "+ Yamaha.getCantidadDeKilometros());
		Yamaha.cambiarChofer(new Persona("Miguel"));
		System.out.println("Chofer: " + Yamaha.getChofer() +" Acompañante: " + Yamaha.getAcompañante() + " Kilometros recorridos: "+ Yamaha.getCantidadDeKilometros());
	}
}
