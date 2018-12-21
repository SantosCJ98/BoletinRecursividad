package codigo;

import static teclado.Teclado.*;

//Pedir un número por teclado. Si es 0, devolvera 0. Si es 1, devolvera 1.
//En caso contrario, sera: numero-1 + numero-2

public class Ej3 {

	public static void main(String[] args) {

		System.out.println("Introduce el elemento de la serie de Fibonacci que desea ver:");

		int n = readEqui(0, Equivalencias.MAYORIGUAL);

		System.out.println(fibonacci(n));

	}

	public static int fibonacci(int n) {

		if (n == 0) {

			return 0;

		}

		else if (n == 1) {

			return 1;

		}

		else {

			return fibonacci(n - 1) + fibonacci(n - 2);

		}

	}

}
