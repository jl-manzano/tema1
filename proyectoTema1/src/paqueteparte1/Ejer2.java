package paqueteparte1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		int años;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su edad: ");
		años = sc.nextInt();
		
		System.out.println("El próximo año tendrás: " + ++años + " años");
		sc.close();
	}
}
