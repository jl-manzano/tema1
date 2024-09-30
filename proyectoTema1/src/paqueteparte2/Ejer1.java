package paqueteparte2;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		double num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nº con decimales: ");
		num = sc.nextDouble();
		
		int parteEntera = (int) num;
		double parteDecimal = num - parteEntera;
		int result = parteDecimal >= 0.5 ? parteEntera + 1 : parteEntera;
		
		System.out.println("El nº redondeado es: " + result);
		
		sc.close();
	}
}