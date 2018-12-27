package codigo;

import static teclado.Teclado.*;

public class Ej6 {

	// Rellenar un array de numeros por teclado. Si el array tiene de longitud 1, es
	// capicua. Si el indice del principio es mayor o igual al del final, es
	// capicua.
	// Si miarray[principio] != miarray[final], no es capicua.

	public static void main(String[] args) {

		// Introducir longitud del array (debe ser mayor que 0)

		System.out.println("Introduce la longitud del array");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Declarar array.

		int[] miarray = new int[n];

		// Rellenar array con números enteros.

		rellenararray(miarray);

		// Mostrar array.

		mostrararray(miarray);

		// Comprobar si es capicua.

		if (capicua(miarray, 0, miarray.length - 1)) {

			System.out.println("El array es capicua");

		}

		else {

			System.out.println("El array no es capicua");

		}

	}

	// Función para rellenar el array.

	public static int[] rellenararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.println("Indice " + i + ": ");

			miarray[i] = readInt();

		}

		return miarray;

	}

	// Función para mostrar el array

	public static void mostrararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + "   ");

		}

		System.out.println();

	}

	// Función recursiva que determina si un array es capicua o no.

	public static boolean capicua(int[] miarray, int principio, int ultimo) {

		// Si la longitud del array es igual a 1, el array es capicua.

		if (miarray.length == 1) {

			return true;

		}

		// Si la posición inicial es mayor o igual a la final, es capicua.

		if (principio >= ultimo) {

			return true;

		}

		// Si el array no se lee igual de izquierda a derecha que de derecha a
		// izquierda, no es capicua

		if (miarray[principio] != miarray[ultimo]) {

			return false;

		}

		return capicua(miarray, principio + 1, ultimo - 1);

	}

}
