package paqueteparte2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
	
	//DECLARAR VARIABLEs TIPO ENTERO
	int num;
	int residuo;
	int result;
	
	// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
	Scanner sc = new Scanner(System.in);
	
	// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
	System.out.println("Introduzca un número para comprobar si es múltiplo de 7: ");
	
	// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
	num = sc.nextInt();
	
	//COMPROBAR SI - MÚLT. 7 / CALC. RESTO
	residuo = num % 7;
	
	//COMPARAR SI Nº - NO MÚLT. 7 -> RESTAR A 7 EL RESTO CALC. ANTERIORM.
	result = residuo == 0 ? 0 : 7 - residuo;
	
	//IMPRIMIR RESULTADO PANTALLA
	System.out.println("A " + num + " hay que sumarle " + result + " para que sea múltiplo de 7.");
<<<<<<< HEAD

	//CERRAR OBJETO SCANNER
=======
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
	sc.close();
	}
}