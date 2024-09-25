package paqueteparte1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		double nota1;
		double nota2;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca una nota: "); 

		// LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		nota1 = sc.nextDouble(); 

		// IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca otra nota: "); 

		// LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		nota2 = sc.nextDouble(); 

		double media_aritm = (nota1 + nota2) / 2;

		System.out.println("La media aritmética de las 2 notas es: " + media_aritm);

		sc.close();
	}
}
