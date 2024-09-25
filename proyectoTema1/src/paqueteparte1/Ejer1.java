package paqueteparte1;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {

		double numero;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un número:");
		
		// LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		numero = sc.nextDouble();

		System.out.println("El número introducido es: " + numero);

		sc.close();
	}
}
