package codigo;

import static teclado.Teclado.readString;

public class Ej5_iterativo {

	// Pedir por teclado una cadena. Contar los espacios de la cadena. Si tiene
	// espacios, sustituirlos por caracter vacio.
	// Tanto si tiene espacios como si no, pasar a minusculas. Si la cadena se lee
	// igual de izquierda a derecha como de derecha a izquierda, es palindroma.

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

	// Función que comprueba si una cadena es palindroma.

	public static boolean palindromo(String c) {

		int espacios = 0;

		// Contar espacios de la cadena.

		for (int i = 0; i < c.length(); i++) {

			if (c.charAt(i) == ' ') {

				espacios++;

			}

		}

		boolean palindromo = true;

		// Si la cadena tiene espacios, convertirlos en caracter vacio. Comprobar si la
		// cadena es igual a su inversa, ignorando mayusculas.

		if (espacios == 0) {

			int i = 0;

			int j = c.length() - 1;

			while (i < c.length() && j >= 0 && palindromo == true) {

				if (String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(i))
						.equals(String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(j)))) {

					i++;

					j--;

				}

				else {

					palindromo = false;
				}

			}

		}

		else if (espacios > 0) {

			int i = 0;

			int j = c.length() - 1 - espacios;

			while (i < c.length() - espacios && j >= 0 && palindromo == true) {

				if (String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(i))
						.equals(String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(j)))) {

					i++;

					j--;

				}

				else {

					palindromo = false;
				}

			}

		}

		return palindromo;

	}

}
