package paqueteparte1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int años;
		System.out.println("Introduzca su edad: ");
		años = sc.nextInt();
		años++;
		System.out.println("El próximo año tendrás: " + años + " años");
		sc.close();
	}
}
