package paqueteparte1;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {

		// DECLARAR VARIABLE TIPO ENTERO Y 'BOOLEANO'
		int age;
		boolean over18;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su edad: "); 
		
		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		age = sc.nextInt(); 

		// COMPARAR VALOR 'AGE' CON '18'
		over18 = age >= 18;

		//IMPRIMIR RESULTADO PANTALLA
		System.out.println(over18); 

		//CERRAR OBJETO SCANNER
		sc.close();

	}
}
