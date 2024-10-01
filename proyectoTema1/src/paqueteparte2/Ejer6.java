package paqueteparte2;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLES TIPO DECIMAL
		double mm;
		double cm;
		double m;
		double totalCm;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca una distancia en 'mm': ");
	
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		mm = sc.nextDouble();
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca una distancia en 'cm': ");
		
		// LEER OTRO NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		cm = sc.nextDouble();
	
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca una distancia en 'm': ");
		
		// LEER OTRO NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		m = sc.nextDouble();
	
		// CÁLCULO CAMBIO DE UD
		totalCm = (mm * 10) + cm + (m / 100);
		
		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("El total de las 3 distancias es: " + totalCm);
	
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
