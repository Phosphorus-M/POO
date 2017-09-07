/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.0 7/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */

package Clases;

public class fecha {
	private int dia;
	private int mes;
	private int año;

	public fecha(){
		this.dia = 1;
		this.mes=1;
		this.año=0;
	}
	public fecha(int dia, int mes, int año){
		if(validador(dia, mes, año)) {
			this.año = año;
			this.dia = dia;
			this.mes = mes;
		}else {
			System.out.println("Fecha invalida");
		}
	}
	
	public Boolean validador(int dia, int mes,  int año) {
		int diamax;
		switch(mes) {
		case 1:{
			diamax = 31;
			break;
		}
		case 2:{
			diamax = 28;
			break;
		}
		case 3:{
			diamax = 31;
			break;
		}
		case 4:{
			diamax = 30;
			break;
		}
		case 5:{
			diamax = 31;
			break;
		}
		case 6:{
			diamax = 30;
			break;
		}
		case 7:{
			diamax = 31;
			break;
		}
		case 8:{
			diamax = 31;
			break;
		}
		case 9:{
			diamax = 30;
			break;
		}
		case 10:{
			diamax = 31;
			break;
		}
		case 11:{
			diamax = 30;
			break;
		}
		case 12:{
			diamax = 31;
			break;
		}
		default:{
			diamax = 0;
		}
		}
		if((((2016-año)%4) == 0) && mes == 2) {
			if(dia>0 && dia<=29){
				return true;
			}
		}else {
			if(dia>0&&dia<=diamax && mes>0 && mes<=12){
				return true;
			}
		}
		return false;
	}

	public String Mostrafecha() {
		return "("+ this.dia +"/"+ this.mes + "/" + this.año +")";
	}

	public static void main(String[] args) {
		fecha hoy = new fecha(7,9,2017);
		fecha otro = new fecha(-40,-9,2017);
		System.out.println(hoy.Mostrafecha());
		System.out.println(otro.Mostrafecha());
	}

}
