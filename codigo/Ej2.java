package codigo;

//Pedir por teclado dos números. Si el segundo número es 0, el MCD de los dos es el primer número. 
//En caso contrario, será: primero = segundo, segundo = primero%segundo.

import static teclado.Teclado.*;

public class Ej2 {

	public static void main(String[] args) {

		// Pedimos los números (deben de ser enteros)

		System.out.println("Introduce el primer número:");

		int x = readInt();

		System.out.println("Introduce el segundo número:");

		int y = readInt();

		// Mostramos el MCD de ambos números.

		System.out.println("El máximo común divisor de " + x + " y " + y + " es: " + gcd(x, y));

	}

	// Función recursiva para determinar el MCD de dos números.

	public static int gcd(int x, int y) {

		// Si el segundo número es 0, el MCD será el primer número.

		if (y == 0) {

			return x;

		}

		// En caso contrario, será: primero = segundo, segundo = primero%segundo.

		else {

			return gcd(y, x % y);

		}

	}

}
