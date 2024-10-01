package paqueteparte1;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLE TIPO DECIMAL
		double ptas;
		double euros;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la cantidad en pesetas: ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		ptas = sc.nextDouble();
		
		//ESTABLECER VARIABLE EUROS -> 1€ = 166 ptas.
		euros = ptas/166;
		
		//IMPRIMIR RESULTADO PANTALLA - CONVERTIR VALOR VARIABLE EUROS A FORMATO CADENA 2 DECIMALES
		System.out.printf( ptas + " pesetas son " + String.format("%.2f", euros) + " €.");
		
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
