package ejercicio;

public class Main {
	public static void main(String[] args) {
		// Constructor con nota
		Alumno juan= new Alumno(00000002, 10, "Juan");
		//constructor sin nota
		Alumno pepe = new Alumno(00000001, "Pepe");
		Alumno miguel = new Alumno(00000003, "Miguel");
		
		// Le asigno la nota a los que no tiene nota
		pepe.setNota(6);
		miguel.setNota(5);
		//Crear lista de Alunoos
		Alumno[] listaDeAlumnos = new Alumno[3];
		listaDeAlumnos[0] = pepe;
		listaDeAlumnos[1] = juan;
		listaDeAlumnos[2] = miguel;
		
		Planilla POO1 = new Planilla(listaDeAlumnos);
		
		POO1.getAlumnoConMejorNota();
	}
}
