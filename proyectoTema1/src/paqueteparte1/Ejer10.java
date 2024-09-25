package paqueteparte1;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {

		int num;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in); 

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un número: "); 
		
		// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt(); 

		/* DECLARAR VARIABLE TIPO 'BOOLEANO' -> VERIFICAR SI Nº ES PAR / IMPAR MEDIANTE
		 OPERADOR (%) - residuo (usa operador igualdad - == -> comparar valores | !=
		-> operador desigualdad)*/
		boolean par = num % 2 == 0; 

		System.out.println(par);

		sc.close();
	}
}
