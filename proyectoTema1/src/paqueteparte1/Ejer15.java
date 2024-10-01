package paqueteparte1;

import java.util.Scanner;

public class Ejer15 {
	public static void main(String[] args) {
		
		// DECLARAR CONSTANTE TIPO ENTERO
		final int IVA = 21;
		
		//DECLARAR VARIABLE TIPO DECIMAL
		double precio;
		double ivaCalculado;
		double precioFinal;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un precio: ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		precio = sc.nextDouble();
		
		//CALC. IVA
		ivaCalculado = (precio * IVA) / 100;
		
		//CALC. PRECIO FINAL
		precioFinal = precio + ivaCalculado;
		
		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("El precio final con IVA incluido es: " + precioFinal);
		
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}
