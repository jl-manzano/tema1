package paqueteparte1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		double nota1;
		double nota2;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca una nota: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR

		nota1 = sc.nextDouble(); // LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA

		System.out.println("Introduzca otra nota: "); // IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR

		nota2 = sc.nextDouble(); // LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA

		double media_aritm = (nota1 + nota2) / 2;

		System.out.println("La media aritmética de las 2 notas es: " + media_aritm);

		sc.close();
	}
}
