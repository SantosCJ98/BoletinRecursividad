package codigo;

import static teclado.Teclado.*;

import static codigo.Ej4.invertircadena;

public class Ej5_recursiva {

	// Pedir por teclado una cadena. Si tiene espacios, sustituirlos por caracter
	// vacio.
	// Tanto si tiene espacios como si no, pasar a minusculas. Si la cadena es igual
	// a su inversa, es palindroma.

	public static void main(String[] args) {

		// Pedir la cadena al usuario.

		System.out.println("Introduce una cadena");

		String c = readString();

		// Comprobar si es palindroma.

		if (palindromo(c)) {

			System.out.println("La cadena es palindroma");

		}

		else {

			System.out.println("La cadena no es palíndroma");
		}

	}

	// Función que determina si una cadena es palíndroma.

	public static boolean palindromo(String c) {

		// Si una cadena es igual a su inversa (ignorando espacios y mayúsculas) es
		// palindroma.

		if (c.toLowerCase().replaceAll("[ ]", "").equals(invertircadena(c.toLowerCase().replaceAll("[ ]", "")))) {

			return true;

		}

		else {

			return false;

		}

	}
}
