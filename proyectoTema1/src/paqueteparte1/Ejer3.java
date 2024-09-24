package paqueteparte1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int año_actual;
		int año_nac;
		System.out.println("Introduzca el año actual: ");
		año_actual = sc.nextInt();
		System.out.println("Introduzca su año de nacimiento: ");
		año_nac = sc.nextInt();
		int años = año_actual - año_nac;
		System.out.println("Usted tiene " + años + " años");
		sc.close();
	}
}