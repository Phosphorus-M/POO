/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 27/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clase_6_herencias.ejercicio_2;

public class empleados {
	private String name;
	private Integer sueldo;
	private Boolean cargo;
	private Boolean planta;
	private Integer horas;
	private Integer antiguedad;
	private Integer hijos;
	private Boolean matrimonio;
	public empleados(String nombre, Boolean planta, Integer horas, Integer antiguedad, Integer hijos, Boolean matrimonio) {
		this.setName(nombre);
		this.setCargo(Boolean.FALSE);
		this.setPlanta(planta);
		this.setAntiguedad(antiguedad);
		this.setHijos(hijos);
		this.setMatrimonio(matrimonio);
		this.setHoras(horas);
	}
	public empleados(empleados Empleado) {
		this.setName(Empleado.getName());
		this.setCargo(Empleado.getCargo());
		this.setPlanta(Empleado.getPlanta());
		this.setAntiguedad(Empleado.getAntiguedad());
		this.setHijos(Empleado.getHijos());
		this.setMatrimonio(Empleado.getMatrimonio());
		this.setHoras(Empleado.getHoras());
	}
	public empleados(String nombre, Boolean cargo, Boolean planta, Integer horas, Integer antiguedad, Integer hijos, Boolean matrimonio) {
		this.setName(nombre);
		if(cargo) {
			if(planta) {
				this.setPlanta(planta);
				this.setCargo(cargo);
			}else {
				this.setCargo(Boolean.FALSE);
				this.setPlanta(planta);
			}
		}else {
			this.setCargo(cargo);
			this.setPlanta(planta);
		}
		this.setHoras(horas);
		this.setAntiguedad(antiguedad);
		this.setHijos(hijos);
		this.setMatrimonio(matrimonio);
	}
	
	public Boolean getCargo() {
		return cargo;
	}
	public String getStringDeCargo() {
		if(cargo == Boolean.FALSE) return "Empleado";
		return "Gerente";
	}
	public void setCargo(Boolean cargo) {
		this.cargo = cargo;
	}
	public Boolean getPlanta() {
		return planta;
	}
	public void setPlanta(Boolean planta) {
		this.planta = planta;
	}
	public String getStringDePlanta() {
		if(planta == Boolean.FALSE)	return "Temporaria";
		return "Permanente";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		empleados other = (empleados) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (planta == null) {
			if (other.planta != null)
				return false;
		} else if (!planta.equals(other.planta))
			return false;
		if (sueldo == null) {
			if (other.sueldo != null)
				return false;
		} else if (!sueldo.equals(other.sueldo))
			return false;
		return true;
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	public Integer getHijos() {
		return hijos;
	}
	public void setHijos(Integer hijos) {
		if(hijos>=0) this.hijos = hijos;
	}
	public Boolean getMatrimonio() {
		return matrimonio;
	}
	public String getStringDeMatrimonio() {
		if(this.matrimonio == Boolean.TRUE) return " Casad@";
		return " Solter@";
	}
	public void setMatrimonio(Boolean matrimonio) {
		this.matrimonio = matrimonio;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
}
