package codigo;

import static teclado.Teclado.*;

import static codigo.Ej3.fibonacci;

//Pedir el número de la serie de fibonacci al cual queremos llegar. Mostrar secuencia de fibonacci hasta el límite (establecida por la función
//del ejercicio anterior)

public class Ej3a {

	public static void main(String[] args) {

		// Pedir el limite al usuario (debe ser mayor o igual a 0)

		System.out.println("¿Hasta que elemento de la serie de Fibonnaci quiere llegar?");

		int n = readEqui(0, Equivalencias.MAYORIGUAL);

		// Mostrar serie.

		serie(fibonacci(n));

	}
	
	//Función que escribe la serie.

	public static void serie(int limite) {

		int a = 0;

		int b = 1;

		// Si el limite es cero, se muestra 0.

		if (limite == 0) {

			System.out.print(a);

		}

		// Si el limite es 1, se muestra 0 y 1.

		else if (limite == 1) {

			System.out.print(a + "   " + b);

		}

		// En caso contrario, se muestra la serie, hasta llegar a ese número.

		else {

			System.out.print(0 + "   " + 1 + "   "); // Se muestra 0 y 1 al principio.

			while (b + a <= limite) { // Hasta que se llegue al límite...

				int aux = a;

				a = b;

				b = aux + a;

				System.out.print(b + "   "); // Mostrar serie.

			}

		}

	}

}
