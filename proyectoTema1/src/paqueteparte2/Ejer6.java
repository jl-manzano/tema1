package paqueteparte2;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		double mm;
		double cm;
		double m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una distancia en 'mm': ");
		mm = sc.nextDouble();
		
		System.out.println("Introduzca una distancia en 'cm': ");
		cm = sc.nextDouble();
	
		System.out.println("Introduzca una distancia en 'm': ");
		m = sc.nextDouble();
	
		double totalCm = (mm * 10) + cm + (m / 100);
		
		System.out.println("El total de las 3 distancias es: " + totalCm);
	
		sc.close();
	}
}
