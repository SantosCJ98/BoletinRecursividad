package codigo;

import static teclado.Teclado.*;

//Pedir un número por teclado. Si es 0, devolvera 0. Si es 1, devolvera 1.
//En caso contrario, sera: numero-1 + numero-2

public class Ej3 {

	public static void main(String[] args) {

		// Pedir al usuario la posicion de la serie de Fibonacci que desea ver. (mayor o
		// igual que 0)

		System.out.println("Introduce el elemento de la serie de Fibonacci que desea ver:");

		int n = readEqui(0, Equivalencias.MAYORIGUAL);

		// Mostrar el elemento resultante.

		System.out.println(fibonacci(n));

	}

	// Función recursiva para determinar el elemento de Fibonacci que se desea ver.

	public static int fibonacci(int n) {

		// Si se introduce 0, se mostrará 0.

		if (n == 0) {

			return 0;

		}

		// Si se introduce 1, se mostrará 1.

		else if (n == 1) {

			return 1;

		}

		// En caso contrario, se realizará la serie de Fibonacci hasta esa posicion.

		else {

			return fibonacci(n - 1) + fibonacci(n - 2);

		}

	}

}
