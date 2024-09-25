package paqueteparte1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		int año_actual;
		int año_nac;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca el año actual: "); 
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		año_actual = sc.nextInt(); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su año de nacimiento: "); 
		
		// LEER OTRO Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		año_nac = sc.nextInt(); 

		int años = año_actual - año_nac;

		System.out.println("Usted tiene " + años + " años");

		sc.close();
	}
}