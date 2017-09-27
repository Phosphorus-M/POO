/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 27/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package clase_6_herencias.ejercicio_2;

public class TestEmpresa {	
	public static void main(String[] args) {
		empresa LaPerlita = new empresa("La Perlita", 30);
		LaPerlita.setEmpleados("Nuestro señor el \"Temporal\"", Boolean.FALSE, 80, 0, 0, Boolean.TRUE);
		empleados Juan = new empleados("El \"Permanente\" no gerente", Boolean.TRUE, 80, 6, 2, Boolean.TRUE);
		LaPerlita.setEmpleados(Juan);
		LaPerlita.setEmpleados("El \"Permanente\" no gerente x2", Boolean.TRUE, 160, 4, 0, Boolean.FALSE);
		LaPerlita.setEmpleados("El \"Gerente\"", Boolean.TRUE, Boolean.TRUE, 160, 10, 1, Boolean.TRUE);
		

		System.out.println(LaPerlita.getNombreDeEmpresa());

		System.out.println(LaPerlita.getNombreDelEmpleado("Miguel"));
		System.out.println(LaPerlita.getNombreDelEmpleado("El \"Gerente\""));
		System.out.println("Total a pagar en sueldos: " + LaPerlita.montoTotal());
		
	}
}
