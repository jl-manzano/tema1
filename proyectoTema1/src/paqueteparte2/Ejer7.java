package paqueteparte2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		//DECLARAR CONSTANTE TIPO DECIMAL
		final double ENTR_INF = 15.5;
		
		//DECLARAR CONSTANTE TIPO ENTERO
		final int ENTR_AD = 20;
		
		//DECLARAR VARIABLES TIPO ENTERO
		int numInf;
		int numAd;
		
		//DECLARAR VARIABLES TIPO DECIMAL
		double total;
		double result;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca el nº de entradas infantiles a comprar: ");
	
		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		numInf = sc.nextInt();
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca el nº de entradas de adultos a comprar: ");
		
		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		numAd = sc.nextInt();
		
		// CALCULAR TOTAL
		total = (numInf * ENTR_INF) + (numAd * ENTR_AD);
	
		// COMPARAR SI TOTAL >= 100 euros -> HACER 5% DTO
		result = total >= 100 ? (total * 5) / 100 : total;
	
		//IMPRIMIR RESULTADO PANTALLA
		System.out.printf("Usted debe " + String.format("%.2f", result) + "€.");
	
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
