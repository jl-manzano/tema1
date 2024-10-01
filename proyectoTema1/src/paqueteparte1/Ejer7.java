package paqueteparte1;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO STRING
		String nom;
		String direc;
		String telef;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su nombre: "); 
		
		// LEER MENSAJE CON NOMBRE (STRING) INGRESADO EN CONSOLA
		nom = sc.nextLine(); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca la dirección de su domicilio: "); 
		
		// LEER MENSAJE CON DIRECCIÓN DOMICILIO (STRING) INGRESADO EN CONSOLA
		direc = sc.nextLine(); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su número de teléfono: "); 
		
		// LEER MENSAJE CON Nº TELÉFONO (STRING) INGRESADO EN CONSOLA
		telef = sc.nextLine(); 

		//IMPRIMIR RESULTADOS PANTALLA
		System.out.println("Nombre: " + nom);

		System.out.println("Dirección: " + direc);

		System.out.println("Teléfono: " + telef);

		//CERRAR OBJETO SCANNER
		sc.close();
	}
}