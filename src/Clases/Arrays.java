package Clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println(numeros.isEmpty());
		numeros.add(2);
		numeros.add(5);
		numeros.add(3);
		System.out.println(numeros);
		numeros.remove(2);
		System.out.println(numeros); 
		System.out.println("Posicion del elemento:" + numeros.indexOf(5));
		
		List<Integer> lista = new LinkedList<Integer>();
		System.out.println("Esta vacia:"+ lista.isEmpty());
		lista.add(2);
		lista.add(1, 5);
		lista.add(3);
		System.out.println("toString: " + lista);
		lista.remove(1);
		System.out.println("To sring: "+ lista);
		System.out.println("esta vacia:" + lista.isEmpty());
		System.out.println("Elemento " + lista.get(1));
		System.out.println("Grande" + lista.size());
	}
}
