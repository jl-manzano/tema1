package paqueteparte2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
	
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número para comprobar si es múltiplo de 7: ");
	num = sc.nextInt();
	
	int residuo = num % 7;
	
	int result = residuo == 0 ? 0 : 7 - residuo;
	
	System.out.println("A " + num + " hay que sumarle " + result + " para que sea múltiplo de 7.");

	sc.close();
	}

}