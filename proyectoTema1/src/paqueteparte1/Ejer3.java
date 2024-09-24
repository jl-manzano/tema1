package paqueteparte1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		int año_actual;
		int año_nac;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca el año actual: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		año_actual = sc.nextInt(); // LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA

		System.out.println("Introduzca su año de nacimiento: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		año_nac = sc.nextInt(); // LEER OTRO Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA

		int años = año_actual - año_nac;

		System.out.println("Usted tiene " + años + " años");

		sc.close();
	}
}