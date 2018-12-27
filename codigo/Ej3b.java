package codigo;

import static teclado.Teclado.*;

import static codigo.Ej3.fibonacci;

public class Ej3b {

	// Pedir un número por teclado. Encontrar el primer elemento de fibonacci que
	// sea mayor o igual a dicho número junto a su indice,
	// utilizando la funcion del ejercicio anterior.

	public static void main(String[] args) {

		// Se pide el número al usuario.

		System.out.println("Escribe un número:");

		int num = readInt();

		// Se muestra el primer número mayor o igual de la serie de Fibonacci a ese
		// número junto a su posición.

		System.out.println("Indice: " + posicion(num) + "\nNúmero de Fibonacci: " + mayor(num));

	}

	// Función que busca la posición

	public static int posicion(int num) {

		int indice = 0;

		boolean encontrado = false;

		int i = 0;

		while (!encontrado) {

			if (fibonacci(i) >= num) {

				indice = i;

				encontrado = true; // Si encuentra el número, deja de buscar.

			}

			else {

				i++; // En caso contrario, sigue buscando.

			}

		}

		return indice; // Retorna el indice.

	}

	// Función que busca el número.

	public static int mayor(int num) {

		int res = 0;

		boolean encontrado = false;

		int i = 0;

		while (!encontrado) {

			if (fibonacci(i) >= num) {

				res = fibonacci(i);

				encontrado = true; // Si lo encuentra, deja de buscar.

			}

			else {

				i++; // En caso contrario, sigue buscando.

			}

		}

		return res; // Devuelve el número.

	}

}
