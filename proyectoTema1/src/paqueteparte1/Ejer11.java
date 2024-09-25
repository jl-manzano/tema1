package paqueteparte1;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		double ptas;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la cantidad en pesetas: ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		ptas = sc.nextDouble();
		
		//ESTABLECER VARIABLE EUROS -> 1€ = 166 ptas.
		double euros = ptas/166;
		
		System.out.printf( ptas + " pesetas son " + String.format("%.2f", euros) + " €.");
		
		sc.close();
	}
}
