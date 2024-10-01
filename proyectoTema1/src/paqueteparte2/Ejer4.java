package paqueteparte2;
import java.util.Scanner;
public class Ejer4 {
	public static void main(String[] args) {
		
		//DECLARAR VARIABLES TIPO DECIMAL
		double a;
		double b;
		double c;
		double x;
		double result;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÁLCULO POLINOMIO DE SEGUNDO GRADO - 'y=ax^2+bx+c'");
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el valor para 'a': ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		a = sc.nextDouble();
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el valor para 'b': ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		b = sc.nextDouble();
<<<<<<< HEAD

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		System.out.println("Introduce el valor para 'c': ");
		
		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		c = sc.nextDouble();
<<<<<<< HEAD

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
=======
		
>>>>>>> branch 'master' of https://github.com/jl-manzano/tema1.git
		System.out.println("Introduce el valor para 'x': ");

		// LEER NÚMERO TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		x = sc.nextDouble();
		
		//CALCULAR POLINOMIO DE 2º GRADO
		result = a * Math.pow(x, 2) + b * x + c;
		
		//IMPRIMIR RESULTADO PANTALLA
		System.out.println("y= " + result);
	
		//CERRAR OBJETO SCANNER
		sc.close();
	}
}