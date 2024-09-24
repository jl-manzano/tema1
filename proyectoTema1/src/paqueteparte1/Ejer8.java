package paqueteparte1;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		String nom;
		int edad;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre: ");
		nom = sc.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		System.out.println("Hola " + nom + ", tienes " + edad + " años, ¡qué mayor eres!");

		sc.close();
		
	}
}