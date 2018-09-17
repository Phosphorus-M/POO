/**
 * @author: Phosphorus Moscu / Fernando Pastorelli
 * @version: v1.1 1/09/2017
 * @see <a href = "https://github.com/Phosphorus-M/Java"> Clases de Java </a>
 */
package objetos2017.SC.clases;
import static java.lang.Math.*;
public class Complejo {
	//Atributos de objetos
	private double real;  
	private double img;
	//Constructor con parametros
	public Complejo(double a, double b){
		this.real=a;
		this.img=b;
	}
	//Constructor sin parametros
	public Complejo (){  
		this.real=0;
		this.img=0;
	}

	public String toString(){
		return "("+this.real+","+this.img+")";
	}

	public Complejo sumar(Complejo z){
		Complejo aux=new Complejo();
		aux.real=this.real+z.real;
		aux.img=this.img+z.img;
		return aux;
	}
	public Complejo multiplicar(Complejo x){
		Complejo aux2 = new Complejo();
		aux2.real=this.real*x.real;
		aux2.img=this.img*x.img;
		return aux2;
	}
	/*
	Esto clona el objeto el metodo es clone()
	 */
	public Complejo clone(){
		Complejo aux3 = new Complejo();
		aux3.real = this.real;
		aux3.img = this.img;
		return aux3;
	}
	//Saca el modulo
	public double Modulo()	{
		return(sqrt(pow(real,2)+pow(img,2)));
	}
	//Equals comprueba si el objeto es identico a otro
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		if (Double.doubleToLongBits(img) != Double.doubleToLongBits(other.img))
			return false;
		return true;
	}
	//Main
	public static void main(String[] args) {  
		Complejo z0 = new Complejo();
		Complejo z1 = new Complejo(3,2);
		Complejo z2 = new Complejo(2.2,2.2);
		System.out.println("Z0:" + z0);
		System.out.println("Z1:" + z1);
		System.out.println("Z2:" + z2);
		Complejo z3 = z1.sumar(z2);
		Complejo z4=z1.multiplicar(z2);
		System.out.println("Z3:" + z3);
		System.out.println("Z4:" + z4);
		Complejo z5= z1.clone(); // Prueba del metodo clone()
		System.out.println("Z5:" + z5);
		//Prueba para ver si funciona que equals retorna verdadero o falso
		for(int i=0; i<2;i++) {
			if(z1.equals(z5)) {
				System.out.println("Z1 y Z5 son iguales");
				System.out.println("Ahora Z5 sera igual a Z2");
				z5= z2.clone();
				System.out.println("Z5:" + z5);
			}else {
				System.out.println("Z1 y Z5 no son iguales");
			}
		}
	}
}
