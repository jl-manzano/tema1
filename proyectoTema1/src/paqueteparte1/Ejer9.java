package paqueteparte1;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {

		int age;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su edad: "); 
		
		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		age = sc.nextInt(); 

		// DECLARAR VARIABLE TIPO 'BOOLEANO' -> COMPARAR VALOR 'AGE' CON '18'
		boolean over18 = age >= 18;

		System.out.println(over18); 

		sc.close();

	}
}
