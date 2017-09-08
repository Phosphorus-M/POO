/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v0.3 7/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

public class Examen {
	private Integer dia;
	private Integer mes;
	private Integer año;
	private String materia;
	private fecha Fecha;

	public Examen(String materia,Integer dia, Integer mes, Integer año){
		this.materia = materia;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.Fecha = new fecha(dia, mes, año); 
	}
		
	public static void main(String[] args) {
		ArrayList<Examen> examen = new ArrayList<Examen>();
		Examen examen1 = new Examen( "Matematica",10, 2, 1998);
		examen.add(examen1);
		System.out.println(examen.get(0).materia);
	}
}
