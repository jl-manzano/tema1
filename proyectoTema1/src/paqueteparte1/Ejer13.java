package paqueteparte1;

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO 'BOOLEANO'
		boolean llueve;
		boolean tareaFin;
		boolean irBiblioteca;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("¿Hoy llueve? ");

		// LEER VALOR TIPO 'BOOLEANO' (BOOLEAN) INGRESADO EN CONSOLA
		llueve = sc.nextBoolean();

		// IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("¿Has finalizado tus tareas? ");

		// LEER OTRO VALOR TIPO 'BOOLEANO' (BOOLEAN) INGRESADO EN CONSOLA
		tareaFin = sc.nextBoolean();

		// IMPRIMIR OTRO MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("¿Necesitas ir a la biblioteca? ");

		// LEER OTRO VALOR TIPO 'BOOLEANO' (BOOLEAN) INGRESADO EN CONSOLA
		irBiblioteca = sc.nextBoolean();

		// EVALUAR SI NO LLUEVE; CONDICIÓN - SI TAREAS REALIZADAS / SI VA A BIBLIOTECA
		boolean salirCalle = (!llueve && tareaFin | irBiblioteca);

		System.out.println("¿Puedes salir a la calle? " + salirCalle);

		sc.close();
	}
}
