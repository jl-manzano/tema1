package paqueteparte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO DECIMAL
		double radio;
		double longitud;
		double area;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca el radio de la circunferencia: "); 

		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		radio = sc.nextDouble(); 

		// FÓRMULA PARA CALCULAR LA LONGITUD DE CIRCUNFERENCIA
		longitud = (2 * Math.PI * radio); 

		// FÓRMULA PARA CALCULAR EL ÁREA DE CIRCUNFERENCIA
		area = Math.PI * Math.pow(radio, 2); 

		//IMPRIMIR RESULTADO PANTALLA
		System.out.printf("La longitud de la circunferencia es: %.2f\n", longitud); // REDONDEAR A 2 DECIMALES

		//IMPRIMIR RESULTADO PANTALLA
		System.out.printf("El área de la circunferencia es: %.2f\n", area); // REDONDEAR A 2 DECIMALES

		// OTRO MÉTODO SIN REDONDEAR DECIMALES

		/*
		 * System.out.println("La longitud de la circunferencia es: " + longitud +
		 * " y el área es: " + area);
		 */

		//CERRAR OBJETO SCANNER
		sc.close();

	}
}