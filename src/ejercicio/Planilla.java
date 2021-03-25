package ejercicio;

public class Planilla {
	Alumno[] listaDeAlumnos;

	public Planilla(Alumno[] listaDeAlumnos) {
		this.listaDeAlumnos = listaDeAlumnos;
	}
	
	public double obtenerNotaPromedio() {
		double total = 0.0;
		for (int i = 0; i < listaDeAlumnos.length; i++) {
			total = total + listaDeAlumnos[i].getNota();
		}
		total = total/listaDeAlumnos.length;
		
		return total;
	}
	
	public void informarNombreYNotaDelMejorAlumno() {
		int mejorNota = 0;
		String mejorNombre = "";
		for (int i = 0; i < listaDeAlumnos.length; i++) {
			Alumno alumnoActual = listaDeAlumnos[i];
			
			if(mejorNota < alumnoActual.getNota()) {
				mejorNota = alumnoActual.getNota();
				mejorNombre = alumnoActual.getNombre(); 
			}
		}
		System.out.println("El mejor alumno es: "+ mejorNombre + " con la nota: "+ mejorNota);
	}
	
	public void getAlumnoConMejorNota() {
		int mejorNota = 0;
		Alumno mejorAlumno = null;
		for (int i = 0; i < listaDeAlumnos.length; i++) {
			Alumno alumnoActual = listaDeAlumnos[i];
			// Si mejor nota es menor a  la nota del alumno actual
			if(mejorNota < alumnoActual.getNota()) {
				mejorNota = alumnoActual.getNota();
				mejorAlumno = alumnoActual;
			}
		}
		System.out.println(mejorAlumno);
	}
	
	
	public void mostrarListadoDeAlumnos() {
		System.out.println("La cantidad de alumnos es: " + listaDeAlumnos.length);
	}
}

