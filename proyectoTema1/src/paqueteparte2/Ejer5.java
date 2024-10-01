package paqueteparte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLES TIPO ENTERO
		int totalSegundos;
		int horas;
		int min;
		int seg;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca una cantidad de segundos: ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		totalSegundos = sc.nextInt();

		// CONVERTIR VALOR EN REPRESENTACIÓN DE H, MIN Y S
		horas = totalSegundos / 3600;
		min = (totalSegundos % 3600) / 60;
		seg = totalSegundos % 60;

		//IMPRIMIR RESULTADO PANTALLA
		System.out.println(totalSegundos + " segundos son: " + horas + " horas, " + min + " minutos y " + seg + " segundos.");

		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
