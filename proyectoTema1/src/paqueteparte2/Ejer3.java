package paqueteparte2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
	
	//DECLARAR VARIABLES TIPO ENTERO
	int num1;
	int num2;
	int residuo;
	int result;
	
	// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
	Scanner sc = new Scanner(System.in);
	
	// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
	System.out.println("Introduzca un número: ");
	
	// LEER NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
	num1 = sc.nextInt();
	
	// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
	System.out.println("Introduzca un número: ");
	
	// LEER OTRO NÚMERO TIPO ENTERO (INT) INGRESADO EN CONSOLA
	num2 = sc.nextInt();
	
	//COMPROBAR SI - NUM1 - MÚLT. DE NUM2 / CALC. RESTO
	residuo = num1 % num2;
	
	//COMPARAR SI NUM1 - NO MÚLT. NUM2 -> RESTAR A NUM2 EL RESTO CALC. ANTERIORM.
	 result = residuo == 0 ? 0 : (num2 - residuo);
	
	//IMPRIMIR RESULTADO PANTALLA
	System.out.println("A " + num1 + " hay que sumarle " + result + " para que sea múltiplo de " + num2 + ".");

	//CERRAR OBJETO SCANNER
	sc.close();

	}
}