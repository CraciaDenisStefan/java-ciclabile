package org.lessons.java.ciclabile;

public class Main {
	
	public static void main(String[] args) {

		 int[] array = {1, 2, 3, 4, 5, 6};
	       ElencoInteri ciclatore = new ElencoInteri(array);

	        while (ciclatore.hasAncoraElementi()) {
	            System.out.println("Elemento: " + ciclatore.getElementoSuccessivo());
	        }

	        ciclatore.addElemento(7);

	        while (ciclatore.hasAncoraElementi()) {
	            System.out.println("Elemento: " + ciclatore.getElementoSuccessivo());
	        }
	}
}
