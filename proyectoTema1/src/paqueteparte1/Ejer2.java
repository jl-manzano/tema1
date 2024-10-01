package paqueteparte1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		// DECLARAR VARIABLE TIPO DECIMAL
		int años;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su edad: "); 
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		años = sc.nextInt(); 

		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("El próximo año tendrás: " + ++años + " años");

		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
