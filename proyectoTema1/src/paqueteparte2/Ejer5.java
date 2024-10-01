package paqueteparte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLES TIPO ENTERO
		int totalSegundos;
		int horas;
		int min;
		int seg;
<<<<<<< HEAD

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		System.out.println("Introduzca una cantidad de segundos: ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		totalSegundos = sc.nextInt();
<<<<<<< HEAD

		// CONVERTIR VALOR EN REPRESENTACIÓN DE H, MIN Y S
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		horas = totalSegundos / 3600;
		min = (totalSegundos % 3600) / 60;
		seg = totalSegundos % 60;
<<<<<<< HEAD

		//IMPRIMIR RESULTADO PANTALLA
=======
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		System.out.println(totalSegundos + " segundos son: " + horas + " horas, " + min + " minutos y " + seg + " segundos.");
<<<<<<< HEAD

		//CERRAR OBJETO SCANNER
=======
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		sc.close();
	}
}