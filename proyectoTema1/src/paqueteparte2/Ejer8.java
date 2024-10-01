package paqueteparte2;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLE TIPO DECIMAL
		double longitud;
		double rank;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
	
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la longitud de su lanzamiento 'm': ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		longitud = sc.nextDouble();
		
		// CAMBIAR UD 'm' a 'cm'
		rank = longitud * 100;
		
		//IMPRIMIR RESULTADO PANTALLA - (CASTEO RESULT. FINAL -> MOSTRAR PARTE ENTERA EN 'cm')
		System.out.println("Su lanzamiento ha sido de: " + (int) rank + " cm.");
		
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
