package paqueteparte2;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {

		//DECLARAR VARIABLE TIPO DECIMAL Y ENTERO
		double num;
		int parteEntera;
		double parteDecimal;
		int result;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un nº con decimales: ");

		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		num = sc.nextDouble();

		//SEPARAR PARTE ENTERA DE Nº -> PASAR Nº DECIMAL A ENTERO (INT)
		parteEntera = (int) num;

		//SEPARAR PARTE DECIMAL DE Nº
		parteDecimal = num - parteEntera;

		//COMPARAR PARTE DECIMAL SI  >  0,5; SUMAR 1 A PARTE ENTERA, SI NO, MOSTRAR Nº
		result = parteDecimal >= 0.5 ? parteEntera + 1 : parteEntera;
		
		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("El nº redondeado es: " + result);
		
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
