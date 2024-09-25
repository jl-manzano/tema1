package paqueteparte1;

import java.util.Scanner;

public class Ejer15 {
	public static void main(String[] args) {
		
		final int IVA = 21;
		double precio;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un precio: ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		precio = sc.nextDouble();
		
		double ivaCalculado = (precio * IVA) / 100;
		
		double precioFinal = precio + ivaCalculado;
		
		System.out.println("El precio final con IVA incluido es: " + precioFinal);
		
		sc.close();
	}
}
