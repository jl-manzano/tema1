package paqueteparte2;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
<<<<<<< HEAD

		//DECLARAR VARIABLE TIPO DECIMAL Y ENTERO
=======
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		double num;
<<<<<<< HEAD
		int parteEntera;
		double parteDecimal;
		int result;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		System.out.println("Introduce un nº con decimales: ");
<<<<<<< HEAD

		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
=======
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		num = sc.nextDouble();
<<<<<<< HEAD

		//SEPARAR PARTE ENTERA DE Nº -> PASAR Nº DECIMAL A ENTERO (INT)
		parteEntera = (int) num;

		//SEPARAR PARTE DECIMAL DE Nº
		parteDecimal = num - parteEntera;

		//COMPARAR PARTE DECIMAL SI  >  0,5; SUMAR 1 A PARTE ENTERA, SI NO, MOSTRAR Nº
		result = parteDecimal >= 0.5 ? parteEntera + 1 : parteEntera;
=======
		
		int parteEntera = (int) num;
		double parteDecimal = num - parteEntera;
		int result = parteDecimal >= 0.5 ? parteEntera + 1 : parteEntera;
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		
		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("El nº redondeado es: " + result);
		
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}