package codigo;

import static teclado.Teclado.*;

import static codigo.Ej3.fibonacci;

//Pedir el número de la serie de fibonacci al cual queremos llegar. Mostrar secuencia de fibonacci hasta el límite (establecida por la función
//del ejercicio anterior)

public class Ej3a {

	public static void main(String[] args) {

		System.out.println("¿Hasta que elemento de la serie de Fibonnaci quiere llegar?");

		int n = readInt();

		int limite = fibonacci(n);

		serie(limite);

	}

	public static void serie(int limite) {

		int a = 0;

		int b = 1;

		if (limite == 0) {

			System.out.print(a);

		}

		else if (limite == 1) {

			System.out.print(a + "   " + b);

		}

		else {

			System.out.print(0 + "   " + 1 + "   ");

			while (b + a <= limite) {

				int aux = a;

				a = b;

				b = aux + a;

				System.out.print(b + "   ");

			}

		}

	}

}
