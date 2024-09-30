package paqueteparte2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
	
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número: ");
	num1 = sc.nextInt();
	
	System.out.println("Introduzca un número: ");
	num2 = sc.nextInt();
	
	int residuo = num1 % num2;
	
	int result = residuo == 0 ? 0 : (num2 - residuo);
	
	System.out.println("A " + num1 + " hay que sumarle " + result + " para que sea múltiplo de " + num2 + ".");
	sc.close();
	}
}