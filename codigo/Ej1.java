package codigo;

import static teclado.Teclado.*;

public class Ej1 {

	// Pedir la base y el exponente (mayor o igual que cero) por teclado. Si el
	// exponente es 0, se devuelve 1. Si es 1, se devuelve la base.
	// En caso contrario, ir multiplicando la base tantas veces como indique el
	// exponente.

	public static void main(String[] args) {

		// Le pedimos al usuario la base.

		System.out.println("Introduce la base:");

		// El usuario introduce la introduce (debe ser un numero entero)

		int base = readInt();

		// El usuario introduce el exponente

		System.out.println("Introduce el exponente:");

		// El usuario lo introduce (debe ser un numero entero mayor o igual a 0)

		int exponente = readEqui(0, Equivalencias.MAYORIGUAL);

		// Mostramos el resultado

		System.out.println("El resultado es: " + potencia(base, exponente));

	}

	// Función recursiva para hacer la potencia de un número a través de su base y
	// exponente.

	public static int potencia(int base, int exponente) {

		// Si el exponente es 1, la funcion devuelve la base.

		if (exponente == 1) {

			return base;

		}

		// Si el exponente es 0, la funcion devuelve 1.

		else if (exponente == 0) {

			return 1;

		}

		// En caso contrario, lo que funcion ira haciendo sera multiplicar la base
		// por si misma tantas veces como indique el exponente

		else {

			return base * potencia(base, exponente - 1);

		}

	}

}
