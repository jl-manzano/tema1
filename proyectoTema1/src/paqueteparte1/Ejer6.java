package paqueteparte1;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca un número: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		num1 = sc.nextInt(); // LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA

		System.out.println("Introduzca otro número: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		num2 = sc.nextInt(); // LEER OTRO NÚMERO TIPO INT (ENTERO) INGRESADO EN CONSOLA

		int suma = num1 + num2;
		int resta = num1 - num2;
		int mult = num1 * num2;
		int divis = num1 / num2;

		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma + "."); // RESULTADO OPERACION SUMA

		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta + "."); // RESULTADO OPERACION RESTA

		System.out.println("El producto de " + num1 + " y " + num2 + " es: " + mult + "."); // RESULTADO OPERACION
																							// MULTIPLICACIÓN

		System.out.println("La división de " + num1 + " entre " + num2 + " es: " + divis + "."); // RESULTADO OPERACION
																									// DIVISIÓN

		sc.close();

	}
}