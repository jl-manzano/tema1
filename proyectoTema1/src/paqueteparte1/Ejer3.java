package paqueteparte1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO ENTERO
		int año_actual;
		int año_nac;
		int años;

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

		//CALC. EDAD
		años = año_actual - año_nac;

		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("Usted tiene " + años + " años");

		//CERRAR OBJETO SCANNER
		sc.close();
	}
}