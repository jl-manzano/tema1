package paqueteparte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		int totalSegundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cantidad de segundos: ");
		totalSegundos = sc.nextInt();
		
		int horas = (totalSegundos / 3600);
		int minutos = (totalSegundos % 3600)/60;
		int segundos = (totalSegundos % 60);
	
		System.out.println(totalSegundos + " segundos equivalen a:");
		System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
	
		sc.close();
	}
}
