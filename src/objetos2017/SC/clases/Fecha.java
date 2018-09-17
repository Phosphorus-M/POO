/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.2 10/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */

package objetos2017.SC.clases;

public class Fecha{
	private Integer dia;
	private Integer mes;
	private Integer año;
	private Integer diamax;
	public Fecha(){
		this.dia = null;
		this.mes = null;
		this.año = null;
	}
	public Fecha(int dia, int mes, int año){
		if(validador(dia, mes, año)) {
			this.año = año;
			this.dia = dia;
			this.mes = mes;
		}else {
			System.out.println("Fecha invalida");
			this.dia = null;
			this.mes = null;
			this.año = null;
		}
	}

	public Boolean validador(int dia, int mes,  int año) {
		int diamax = 0;
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
				this.diamax = 29;
				return true;
			}
		}else {
			if(dia>0&&dia<=diamax && mes>0 && mes<=12){
				this.diamax = diamax;
				return true;
			}
		}
		return false;
	}

	public boolean esAnterior(Fecha f) {
		if(this.año==f.año&&this.mes==f.mes&&this.dia==f.mes) return false;
		if(this.año<=f.año&&this.mes<=f.mes&&this.dia<f.dia) return false;
		if(this.año==f.año && this.mes <= f.mes) {
			if((this.dia == this.diamax) && f.dia == 1) {
				return true;
			}else {
				if(this.dia - f.dia == 1) {
					return true;
				}else {
					return false;
				}
			}
		}
		else {
			if(this.año<f.año && this.mes > f.mes) {
				if((this.dia == this.diamax) && f.dia == 1) {
					return true;
				}else {
					if(this.dia - f.dia == 1) {
						return true;
					}else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public String Mostrafecha() {
		return "("+ this.MostrarDia() +"/"+ this.MostrarMes() + "/" + this.MostrarAño() +")";
	}
	public Integer MostrarDia() {
		return this.dia;
	}
	public Integer MostrarMes() {
		return this.mes;
	}
	public Integer MostrarAño() {
		return this.año;
	}
	public static void main(String[] args) {
		Fecha verdadero1 = new Fecha(7,9,2017);
		Fecha verdadero2 = new Fecha(6,9,2017);
		Fecha verdadero3 = new Fecha(30,9,2017);
		Fecha verdadero4 = new Fecha(1,10,2017);
		Fecha verdadero5 = new Fecha(31,12,2017);
		Fecha verdadero6 = new Fecha(1,1,2018);
		Fecha falso1 = new Fecha(4,10,2017);
		Fecha falso2 = new Fecha(8,2,2017);
		Fecha falso3 = new Fecha(5,1,2018);
		System.out.println(verdadero1.Mostrafecha());
		System.out.println(verdadero1.esAnterior(verdadero2));
		System.out.println(verdadero3.esAnterior(verdadero4));
		System.out.println(verdadero5.esAnterior(verdadero6));
		System.out.println(falso1.esAnterior(verdadero2));
		System.out.println(verdadero3.esAnterior(falso2));
		System.out.println(verdadero5.esAnterior(falso3));
	}

}
