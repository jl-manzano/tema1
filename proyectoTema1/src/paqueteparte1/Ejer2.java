package paqueteparte1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		int años;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca su edad: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		años = sc.nextInt(); // LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA

		System.out.println("El próximo año tendrás: " + ++años + " años");

		sc.close();
	}
}
