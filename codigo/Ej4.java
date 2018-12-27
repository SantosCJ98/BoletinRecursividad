package codigo;

import static teclado.Teclado.*;

//Pedir una cadena por teclado. Si la cadena solo tiene un caracter, devolver la cadena.
//En caso contrario, invertirla.

public class Ej4 {

	public static void main(String[] args) {

		// Pedimos la cadena al usuario.

		System.out.println("Introduce una cadena");

		String c = readString();

		// Devolvemos la cadena invertida.

		System.out.println("La cadena invertida es " + invertircadena(c));

	}

	// Función recursiva que invierte la cadena

	public static String invertircadena(String c) {

		// Si la cadena solo tiene un caracter, devolvemos ese caracter.

		if (c.length() == 1) {

			return c;

		}

		// En caso contrario, vamos devolviendo la cadena en orden inverso.

		else {

			return invertircadena(c.substring(1)) + c.charAt(0);

		}

	}

}
