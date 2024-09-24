package paqueteparte1;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca un número: "); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		num = sc.nextInt(); // LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA

		boolean par = num % 2 == 0; // DECLARAR VARIABLE TIPO 'BOOLEANO' -> VERIFICAR SI Nº ES PAR / IMPAR MEDIANTE
									// OPERADOR (%) - residuo (usa operador igualdad - == -> comparar valores | !=
									// -> operador desigualdad)

		System.out.println(par);

		sc.close();
	}
}
