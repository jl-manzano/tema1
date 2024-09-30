package paqueteparte2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		int resto = num % 7;
		
		int aSumar = (resto == 0) ? 0 : (7 - resto);
		
		System.out.println("A " + num + " hay que sumarle " + aSumar + " para que sea múltiplo de 7.");
		
		sc.close();
		
	}
}