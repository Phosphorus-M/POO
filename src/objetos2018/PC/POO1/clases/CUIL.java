package objetos2018.PC.POO1.clases;
/**
 * @author: Phopshorus Moscu
 * @version: v1.0 7/04/2018
 * @see <a href="https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */

import java.util.ArrayList;

public class CUIL {
	private Integer dni;
	private Integer tipo;//Genero
	private Integer xy;
	private Integer z;
	private String cuil;

	public CUIL(Integer dni, char tipo) {
		this.setDNI(dni);
		this.setTipo(tipo);
	}

	private void verificacion() {
		String[] dniPeroEnLetras= Integer.toString(this.getDNI()).split("");
		String[] tipoPeroEnLetras = Integer.toString(this.getTipo()).split("");
		ArrayList<Integer> listaDeValores = new ArrayList<Integer>();
		listaDeValores.add(Integer.parseInt(tipoPeroEnLetras[0])*5);
		listaDeValores.add(Integer.parseInt(tipoPeroEnLetras[1])*4);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[0])*3);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[1])*2);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[2])*7);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[3])*6);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[4])*5);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[5])*4);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[6])*3);
		listaDeValores.add(Integer.parseInt(dniPeroEnLetras[7])*2);
		Integer verificacion = 0,resto;
		for(Integer numerito:listaDeValores) {
			verificacion = numerito + verificacion;
		}
		resto = verificacion%11;

		if (resto == 1) {
			if (this.getTipo() == 20) {
				resto = 9;
				this.setXy(23);;
			}else if(this.getTipo() == 27) {
				resto = 4;
				this.setXy(23);
			}else {
				resto = 11-resto/11;
			}
		}
		this.setZ(11-resto);
		this.cuil = this.getXy() + " - " + this.getDNI() + " - " + this.getZ();
	}

	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
	}


	public Integer getTipo() {
		return tipo;
	}


	public Integer getXy() {
		return xy;
	}


	public void setXy(Integer xy) {
		this.xy = xy;
	}


	public Integer getZ() {
		return z;
	}


	public void setZ(Integer z) {
		this.z = z;
	}

	public void setTipo(char tipo) {
		if (tipo == 'H' || tipo == 'h') {
			this.tipo = 20;
		} else if(tipo == 'M' || tipo == 'm') {
			this.tipo = 27;
		}else {
			this.tipo = 30;
		}
		this.setXy(this.getTipo());
	}

	public Integer getDNI() {
		return this.dni;
	}

	public void setDNI(Integer dni) {
		if (Integer.toString(dni).toCharArray().length == 8) {
			this.dni = dni;
		}else {
			System.out.println("Tu DNI es invalido");
		}
	}

	public static void main(String[] args) {
		CUIL mio = new CUIL(40993996, 'H');
		mio.verificacion();

		System.out.println(mio.getXy() + " - " + mio.getDNI() + " - " + mio.getZ());

		CUIL katy = new CUIL(38537123, 'm'); //Rip DNI de Katy
		katy.verificacion();
		System.out.println(katy.getCuil());

	}

}
