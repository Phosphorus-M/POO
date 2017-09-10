/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.2 10/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
	private String materia = null;
	private fecha Fecha = null;
	private Double nota = null;
	public Examen(String materia, Double nota, Scanner fechas){
		this.IngresarFecha(fechas);
		this.materia = materia;
		this.nota = nota;
	}
	public fecha IngresarFecha(Scanner fechas) {
		this.Fecha = new fecha();
		while(this.Fecha.MostrarDia() == null)
		{
			System.out.println("Ingresar el día del examen"); 
			Integer dia = fechas.nextInt(); //Se lee el día
			System.out.println("Ingresar el mes del examen");
			Integer mes = fechas.nextInt(); //Se lee el mes
			System.out.println("Ingresar el año del examen");
			Integer año = fechas.nextInt(); //Se lee el año
			this.Fecha = new fecha(dia, mes, año);//Asignara los valores a Fecha
		}//Si fecha es null no saldra del bucle y preguntara de nuevo
		return this.Fecha; 
	}
	public static void main(String[] args) {
		ArrayList<Examen> examen = new ArrayList<Examen>();
		Scanner nombre1 = new Scanner(System.in);//Escanea la nombre de la consola
		Scanner notas = new Scanner(System.in);//Escanea la nota de la consola
		Scanner fechas = new Scanner(System.in);//Escanea la fecha de la consola
		
		String nombre = "a";//Inicializa nombre en algo
		Double nota;
		
		while(!nombre.equals("Salir")){
			System.out.println("Ingresar el nombre de la materia");
			nombre = nombre1.nextLine(); //Obtiene el nombre
			if(!nombre.equals("Salir")) {
				do{
					System.out.println("Ingresar la nota del examen");
					nota = notas.nextDouble();//Se lee la nota
					if(nota<0 || nota>10){
						System.out.println("Debe ingresar un valor entre 0 y 10");
					}
				}while(nota<0 || nota>10);//Se comprueba si la nota es valida
				Examen examen1 = new Examen(nombre, nota, fechas);//Se crea un objeto con los valores nombre y nota, pero además se envia el scanner de fecha
				examen.add(examen1);//Agregara el examen a la lista
			}
		}
		fechas.close();//Se deja de escanear la consola
		nombre1.close();//Se deja de escanear la consola
		notas.close();//Se deja de escanear la consola
		for(Integer i=0; i < examen.size(); i++) {//Imprimira la cantidad de examenes realizados
			System.out.println(examen.get(i).materia + " " + examen.get(i).Fecha.MostrarDia() + "/" + examen.get(i).Fecha.MostrarMes() + "/" +examen.get(i).Fecha.MostrarAño() + " " + examen.get(i).nota+ " " + examen.get(i).Fecha.Mostrafecha());
		}

	}

}
