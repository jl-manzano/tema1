package paqueteparte1;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {

		String nom;
		String direc;
		String telef;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca su nombre: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		nom = sc.nextLine(); // LEER MENSAJE CON NOMBRE (STRING) INGRESADO EN CONSOLA

		System.out.println("Introduzca la dirección de su domicilio: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR
																			// VALOR
		direc = sc.nextLine(); // LEER MENSAJE CON DIRECCIÓN DOMICILIO (STRING) INGRESADO EN CONSOLAç

		System.out.println("Introduzca su número de teléfono: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		telef = sc.nextLine(); // LEER MENSAJE CON Nº TELÉFONO (STRING) INGRESADO EN CONSOLA

		System.out.println("Nombre: " + nom);

		System.out.println("Dirección: " + direc);

		System.out.println("Teléfono: " + telef);

		sc.close();
	}
}