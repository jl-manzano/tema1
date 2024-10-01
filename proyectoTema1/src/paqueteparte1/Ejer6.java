package paqueteparte1;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO ENTERO
		int num1;
		int num2;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un número: ");

		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		num1 = sc.nextInt();

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca otro número: ");

		// LEER OTRO NÚMERO TIPO INT (ENTERO) INGRESADO EN CONSOLA
		num2 = sc.nextInt();

		// RESULTADO OPERACION SUMA
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2) + ".");

		// RESULTADO OPERACION RESTA
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2) + ".");

		// RESULTADO OPERACION MULTIPLICACIÓN
		System.out.println("El producto de " + num1 + " y " + num2 + " es: " + num1 * num2 + ".");

		// RESULTADO OPERACION DIVISIÓN
		System.out.println("La división de " + num1 + " entre " + num2 + " es: " + (double) num1 / num2 + ".");

		//CERRAR OBJETO SCANNER
		sc.close();

	}
}