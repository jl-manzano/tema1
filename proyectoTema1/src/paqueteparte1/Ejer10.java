package paqueteparte1;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		num = sc.nextInt();

		boolean par = num % 2 == 0;

		System.out.println(par);

		sc.close();
	}
}
