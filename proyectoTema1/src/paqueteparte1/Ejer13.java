package paqueteparte1;

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {

		boolean llueve;
		boolean tareaFin;
		boolean irBiblioteca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Hoy llueve?");
		llueve = sc.nextBoolean();
		
		System.out.println("¿Has finalizado tus tareas?");
		tareaFin = sc.nextBoolean();
		
		System.out.println("¿Necesitas ir a la biblioteca?");
		irBiblioteca = sc.nextBoolean();
		
		boolean salirCalle = (!llueve && tareaFin || irBiblioteca);
		System.out.println("¿Puedes salir a la calle?: " + salirCalle);
		
		sc.close();
	}
}
