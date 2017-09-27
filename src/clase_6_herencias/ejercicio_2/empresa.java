/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 27/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package clase_6_herencias.ejercicio_2;

public class empresa {
	private String nombreDeEmpresa;
	private Integer cantidadDeEmpleados;
	private empleados[] empleados;
	private Integer cantidadActualDeEmpleados;
	
	public empresa(String nombre, Integer cantidadDeEmpleados) {
		this.setNombreDeEmpresa(nombre);
		this.setCantidadDeEmpleados(cantidadDeEmpleados);
		this.empleados = new empleados[this.getCantidadDeEmpleados()];
		this.setCantidadActualDeEmpleados(0);
	}

	public String getNombreDeEmpresa() {
		return nombreDeEmpresa;
	}

	public Integer getCantidadDeEmpleados() {
		return cantidadDeEmpleados;
	}

	public Integer getCantidadActualDeEmpleados() {
		return cantidadActualDeEmpleados;
	}

	public void setCantidadActualDeEmpleados(Integer cantidadActualDeEmpleados) {
		this.cantidadActualDeEmpleados = cantidadActualDeEmpleados;
	}

	public void setCantidadDeEmpleados(Integer cantidadDeEmpleados) {
		this.cantidadDeEmpleados = cantidadDeEmpleados;
	}

	public void setNombreDeEmpresa(String nombreDeEmpresa) {
		this.nombreDeEmpresa = nombreDeEmpresa;
	}
	
	
	public String getNombreDelEmpleado(empleados Empleado) {
		Integer flag = 0;
		String Cadena = "";
		Integer i = 0;
		if(!this.hayEmpleados()) return "No hay empleados.";
		for(empleados empleado: this.empleados){
			i++;
			if(empleado != null) {
				if(empleado.equals(Empleado))  {
					flag = 1;
					Cadena = Cadena  + "\n"
							+ "Numero de Empleado: " + i  + "\n"
							+ "Nombre: " + empleado.getName() + "\n"
							+ "Planta: " + empleado.getStringDePlanta() + "\n"
							+ "Cargo: " + empleado.getStringDeCargo() + "\n"
							+ "Horas trabajadas: " + empleado.getHoras() + "\n"
							+ "Antiguedad: " + empleado.getAntiguedad() + " Año \n"
							+ "Hijos: " + empleado.getHijos() + "\n"
							+ "Estado Civil: " + empleado.getStringDeMatrimonio() + "\n";
				}
			}
		}
		if(flag==1)	return Cadena;
		return "No existe ese empleado.";
	}
	public String getNombreDelEmpleado(String nombre) {
		Integer flag = 0;
		String Cadena = "";
		Integer i = 0;
		if(!this.hayEmpleados()) return "No hay empleados.";
		for(empleados empleado: this.empleados){
			i++;
			if(empleado != null) {
				if(empleado.getName() == nombre) {
					flag = 1;
					Cadena = Cadena  + "\n"
							+ "Numero de Empleado: " + i  + "\n"
							+ "Nombre: " + empleado.getName() + "\n"
							+ "Planta: " + empleado.getStringDePlanta() + "\n"
							+ "Cargo: " + empleado.getStringDeCargo() + "\n"
							+ "Horas trabajadas: " + empleado.getHoras() + "\n"
							+ "Antiguedad: " + empleado.getAntiguedad() + " Año \n"
							+ "Hijos: " + empleado.getHijos() + "\n"
							+ "Estado Civil: " + empleado.getStringDeMatrimonio() + "\n";
				}
			}
		}
		if(flag==1)	return Cadena;
		return "No hubo coincidencia con el nombre del Empleado.";
	}
	
	public Boolean setEmpleados(empleados Empleado) {
		if(!this.hayCapacidad()) return Boolean.FALSE;
		this.empleados[this.getCantidadActualDeEmpleados()] = new empleados(Empleado);
		this.empleados[this.getCantidadActualDeEmpleados()].setSueldo(this.calculoDeSueldo());
		this.setCantidadActualDeEmpleados(this.getCantidadActualDeEmpleados()+1);
		return Boolean.TRUE;
	}
	public Boolean setEmpleados(String nombre, Boolean planta, Integer horas, Integer antiguedad, Integer hijos,  Boolean matrimonio) {
		if(!this.hayCapacidad()) return Boolean.FALSE;
		this.empleados[this.getCantidadActualDeEmpleados()] = new empleados(nombre, planta, horas, antiguedad, hijos, matrimonio);
		this.empleados[this.getCantidadActualDeEmpleados()].setSueldo(this.calculoDeSueldo());
		this.setCantidadActualDeEmpleados(this.getCantidadActualDeEmpleados()+1);
		return Boolean.TRUE;
	}
	
	public Boolean setEmpleados(String nombre, Boolean cargo, Boolean planta, Integer horas, Integer antiguedad, Integer hijos, Boolean matrimonio) {
		if(!this.hayCapacidad()) return Boolean.FALSE;
		this.empleados[this.getCantidadActualDeEmpleados()] = new empleados(nombre, cargo, planta, horas, antiguedad, hijos, matrimonio);
		this.empleados[this.getCantidadActualDeEmpleados()].setSueldo(this.calculoDeSueldo());
		this.setCantidadActualDeEmpleados(this.getCantidadActualDeEmpleados()+1);
		return Boolean.TRUE;
	}
	public Boolean hayEmpleados() {
		return this.getCantidadActualDeEmpleados()>0;
	}
	public Boolean hayCapacidad() {
		if(this.getCantidadActualDeEmpleados()<this.getCantidadDeEmpleados()) return Boolean.TRUE;
		return Boolean.FALSE;
	}
	
	public Integer calculoDeSueldo() {
		Integer Casado=0;
		if(this.empleados[this.getCantidadActualDeEmpleados()].getMatrimonio()) Casado = 100;
		if(this.empleados[this.getCantidadActualDeEmpleados()].getCargo()) return (this.empleados[this.getCantidadActualDeEmpleados()].getHoras() * 400)+(this.empleados[this.getCantidadActualDeEmpleados()].getAntiguedad()*150) + (200 * this.empleados[this.getCantidadActualDeEmpleados()].getHijos())+Casado;
		if(this.empleados[this.getCantidadActualDeEmpleados()].getPlanta()) return (this.empleados[this.getCantidadActualDeEmpleados()].getHoras() * 300)+(this.empleados[this.getCantidadActualDeEmpleados()].getAntiguedad()*100) + (200 * this.empleados[this.getCantidadActualDeEmpleados()].getHijos())+Casado; 
		return (this.empleados[this.getCantidadActualDeEmpleados()].getHoras() * 200) + (200 * this.empleados[this.getCantidadActualDeEmpleados()].getHijos())+Casado;
	}
	public Integer montoTotal() {
		if(!this.hayEmpleados()) return 0;
		Integer sueldos=0;
		for(empleados empleado: this.empleados){
			if(empleado != null) {
				sueldos = sueldos + empleado.getSueldo();
			}
		}
		return sueldos;
	}
	
}
