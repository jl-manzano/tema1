package paqueteparte2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		final double ENTR_INF = 15.5;
		final int ENTR_AD = 20;
		int numInf;
		int numAd;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nº de entradas infantiles a comprar: ");
		numInf = sc.nextInt();
		
		System.out.println("Introduzca el nº de entradas de adultos a comprar: ");
		numAd = sc.nextInt();
		
		double total = (numInf * ENTR_INF) + (numAd * ENTR_AD);
	
		double result = total >= 100 ? (total * 5) / 100 : total;
	
		System.out.printf("Usted debe " + String.format("%.2f", result) + "€.");
	
		sc.close();
	}
}
