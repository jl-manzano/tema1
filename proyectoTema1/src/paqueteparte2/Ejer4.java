package paqueteparte2;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÁLCULO POLINOMIO DE SEGUNDO GRADO - 'y=ax^2+bx+c'");
		
		System.out.println("Introduce el valor para 'a': ");
		a = sc.nextDouble();
		
		System.out.println("Introduce el valor para 'b': ");
		b = sc.nextDouble();

		System.out.println("Introduce el valor para 'c': ");
		c = sc.nextDouble();

		System.out.println("Introduce el valor para 'x': ");
		x = sc.nextDouble();
		
		double result = a * Math.pow(x, 2) + b * x + c;
		
		System.out.println("y= " + result);
	
		sc.close();
	}
}
