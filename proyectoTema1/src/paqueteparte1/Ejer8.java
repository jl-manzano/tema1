package paqueteparte1;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		String nom;
		int edad;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca su nombre: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		nom = sc.nextLine(); // LEER MENSAJE CON NOMBRE (STRING) INGRESADO EN CONSOLA

		System.out.println("Introduzca su edad: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		edad = sc.nextInt(); // LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA

		System.out.println("Hola " + nom + ", tienes " + edad + " años, ¡qué mayor eres!");

		sc.close();

	}
}