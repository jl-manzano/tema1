package paqueteparte1;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO ENTERO Y DECIMAL
		int nota1;
		int nota2;
		int nota3;
		int notaMediaEntera;
		double notaMediaDecimal;

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

		// DECLARAR VARIABLE -> CALC. NOTA MEDIA
		notaMediaDecimal = (nota1 + nota2 + nota3) / 3.0;

		/* CONVERTIR Nº DECIMAL (conversión explícita / 'CASTING') A Nº ENTERO Y ASIGNAR A VARIABLE notaMediaEntera */
		notaMediaEntera = (int) notaMediaDecimal;

		// IMPRIMIR RESULTADOS PANTALLA
		System.out.println("La nota media para el boletín (parte entera): " + notaMediaEntera);
		System.out.printf("La nota media para el expediente (con decimales): " + String.format("%.2f", notaMediaDecimal));

		// CERRAR OBJETO SCANNER
		sc.close();

	}
}
