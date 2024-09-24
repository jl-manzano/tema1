package paqueteparte1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		double nota1;
		double nota2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Introduzca otra nota: ");
		nota2 = sc.nextDouble();
		double media_aritm = (nota1 + nota2) / 2;
		System.out.println("La media aritmética de las 2 notas es: " + media_aritm);
		sc.close();
	}
}
