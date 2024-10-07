package paqueteparte1;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int nota1;
		int nota2;
		int nota3;
		int notaMediaEntera;
		
		// DECLARAR VARIABLE TIPO DECIMAL (DOUBLE)
		double notaMediaDecimal;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la nota 1: ");
		
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		nota1 = sc.nextInt();
		
		// IMPRIMIR OTRO MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la nota 1: ");
			
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		nota2 = sc.nextInt();
		
		// IMPRIMIR OTRO MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la nota 1: ");
					
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		nota3 = sc.nextInt();
		
		// DECLARAR VARIABLE -> CALC. NOTA MEDIA DECIMAL
		notaMediaDecimal = (double) (nota1 + nota2 + nota3) / 3;

		// DECLARAR VARIABLE -> CAST. NOTA MEDIA DECIMAL -> OBTENER NOTA MEDIA ENTERA
		notaMediaEntera = (int) notaMediaDecimal;
		System.out.println("La media aritmética entera entre " + nota1 + " y " + nota2 + " es: " +  notaMediaEntera);
	
		// IMPRIMIR RESULTADO PANTALLA -> CÁLCULO MEDIA ARITMÉTICA (CAST)
		System.out.println("La media aritmética decimal entre " + nota1 + " y " + nota2 + " es: " +  String.format("%.2f", notaMediaDecimal));

		// CERRAR OBJETO SCANNER
		sc.close();

	}
}
