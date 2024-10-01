package paqueteparte1;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLES TIPO ENTERO Y DECIMAL
		int manz;
		int peras;
		double total;
		
		//DECLARAR CONSTANTES (final)
		final double PRECIO_MANZ = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la cantidad de manzanas vendidas (kg): ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		manz = sc.nextInt();
		
		// IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la cantidad de peras vendidas (kg): ");
		
		// LEER OTRO NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		peras = sc.nextInt();
		
		// DECLARAR VARIABLE TIPO DECIMAL -> CALC. TOTAL MANZ. Y PERAS
		total = (manz * PRECIO_MANZ) + (peras * PRECIO_PERAS);
		
		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("Total: " + total + " €.");
		
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
