package paqueteparte1;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca su edad: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		age = sc.nextInt(); // LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA

		boolean over18 = age >= 18;

		System.out.println(over18); // DECLARAR VARIABLE TIPO 'BOOLEANO' -> COMPARAR VALOR 'AGE' CON '18'

		sc.close();

	}
}
