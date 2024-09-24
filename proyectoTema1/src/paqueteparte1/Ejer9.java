package paqueteparte1;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su edad: ");
		age = sc.nextInt();

		boolean over18 = age >= 18;

		System.out.println(over18);
		
		sc.close();

	}
}
