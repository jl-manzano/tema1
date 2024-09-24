package paqueteparte1;
import java.util.Scanner;
public class Ejer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		System.out.println("Introduzca un número:");
		numero = sc.nextDouble();
		System.out.println("El número introducido es: " + numero);
		sc.close();
	}
}
