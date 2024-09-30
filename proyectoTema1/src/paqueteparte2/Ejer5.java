package paqueteparte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		int totalSegundos;
		int horas;
		int min;
		int seg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cantidad de segundos: ");
		totalSegundos = sc.nextInt();
		
		horas = totalSegundos / 3600;
		min = (totalSegundos % 3600) / 60;
		seg = totalSegundos % 60;
		System.out.println(totalSegundos + " segundos son: " + horas + " horas, " + min + " minutos y " + seg + " segundos.");
		sc.close();
	}
}