/***************************************************************************
##                        Complejo.java
##                    -------------------
##          begin:        Friday', September 1', 2017
##          author:    ('C) 2017 Phosphorus Moscu/Fernando Pastorelli 
##          $Id:          Complejo.java, v 1.0 2017/9/1 01:09:40
##
##
***************************************************************************/
package Clases;
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

	//Main
	public static void main(String[] args) {  
		Complejo z1=new Complejo(3,2);
		Complejo z2=new Complejo(8,5);
		Complejo z3=new Complejo();
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		Complejo z4=z1.multiplicar(z2);
		Complejo z5= z1.clone();
		System.out.println(z4);
		System.out.println(z5);
	}
}
