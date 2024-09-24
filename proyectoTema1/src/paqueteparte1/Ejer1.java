package paqueteparte1;
import java.util.Scanner;
public class Ejer1 {
	public static void main(String[] args) {
		
		double numero;
		
		Scanner sc = new Scanner(System.in); // CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA

		System.out.println("Introduzca un número:"); // IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		numero = sc.nextDouble(); // LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		
		System.out.println("El número introducido es: " + numero);
		
		sc.close();
	}
}
