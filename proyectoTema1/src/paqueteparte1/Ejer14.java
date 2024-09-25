package paqueteparte1;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		int nota1;
		int nota2;
		int nota3;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la primera nota: ");

		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		nota1 = sc.nextInt();

		// IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la segunda nota: ");

		// LEER OTRO NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		nota2 = sc.nextInt();

		// IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la tercera nota: ");

		// LEER OTRO NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		nota3 = sc.nextInt();

		double notaMediaDecimal = (nota1 + nota2 + nota3) / 3.0;

		/* CONVERTIR Nº DECIMAL (conversión explícita / 'CASTING') A Nº ENTERO Y ASIGNAR
		A VARIABLE notaMediaEntera*/
		int notaMediaEntera = (int) notaMediaDecimal;

		System.out.println("La nota media para el boletín (parte entera): " + (int) notaMediaEntera);
		System.out.println("La nota media para el expediente (con decimales): " + notaMediaDecimal);

		sc.close();

	}
}
