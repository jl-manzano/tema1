package paqueteparte1;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		String nom;
		int edad;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su nombre: "); 
		
		// LEER MENSAJE CON NOMBRE (STRING) INGRESADO EN CONSOLA
		nom = sc.nextLine(); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su edad: "); 
		
		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		edad = sc.nextInt(); 

		System.out.println("Hola " + nom + ", tienes " + edad + " años, ¡qué mayor eres!");

		sc.close();

	}
}