package codigo;

//Rellenar un array de numeros decimales por teclado. Ordenar el array de menor a mayor. Buscar un elemento del array, en la posicion de la mitad.
//Si el elemento a buscar es mayor a este, buscar en la mitad superior. Si es menor, buscar en la inferior.
//Si lo encuentra, mostrar el indice en el que aparace.

import static teclado.Teclado.*;

public class Ej7 {

	public static void main(String[] args) {

		// Introducir la longitud (debe ser mayor que 0)

		System.out.println("Introduce la longitud del array");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Introducir el número decimal a buscar.

		System.out.println("¿Qué numero vas a buscar?");

		double buscar = readDouble();

		// Declarar array.

		double[] miarray = new double[n];

		// Relleanr array.

		rellenararray(miarray);

		// Ordenar array de menor a mayor.

		double[] ordenado = burbuja(miarray);

		// Mostrar el array ordenado.

		mostrararray(ordenado);

		// Comprobar si el numero a buscar aparece en el array.

		if (encontrarposicion(ordenado, 1, ordenado.length, buscar)) {

			System.out.println("El elemento " + buscar + " se encuentra en la posicion "
					+ sacarposicion(ordenado, 1, ordenado.length, buscar) + " del array");

		}

		else {

			System.out.println("El elemento " + buscar + " no se encuentra en el array");

		}

	}

	// Función para rellenar el array

	public static double[] rellenararray(double[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.println("Indice " + (i + 1) + ": ");

			miarray[i] = readDouble();

		}

		return miarray;

	}

	// Funcion para mostrar el array

	public static void mostrararray(double[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + "   ");

		}

		System.out.println();

	}

	// Funcion de ordenamiento burbuja (ordenar valores del array de menor a mayor)

	public static double[] burbuja(double[] miarray) {

		for (int i = 0; i < miarray.length - 1; i++) {

			for (int j = i + 1; j < miarray.length; j++) {

				// Si el valor de la izquierda es mayor que el de la derecha, se cambian de
				// lugar.

				if (miarray[j] < miarray[i]) {

					double aux = miarray[j];

					miarray[j] = miarray[i];

					miarray[i] = aux;

				}

			}

		}

		return miarray;

	}

	// Funcion recursiva para determinar si aparece el número.

	public static boolean encontrarposicion(double[] miarray, int inicio, int ultimo, double buscar) {

		int aumento = inicio;

		int decremento = ultimo;

		int indicemitad = (int) Math.floor(((ultimo + inicio) / 2) - 1);

		int longitud = (ultimo - inicio);

		if (miarray[indicemitad] == buscar && longitud == 0) { // Si el valor a buscar aparece en la mitad del array,
																// devuelve true

			return true;

		}

		else if (miarray[indicemitad] == buscar && longitud > 0) {

			return true;

		}

		else if (miarray[indicemitad] != buscar && longitud == 0) { // Si la longitud es 0, y no aparece en la mitad,
																	// devuelve false.

			return false;

		}

		else if (miarray[indicemitad] < buscar && longitud > 0) { // Si el valor de la mitad es mayor, y la longitud es
																	// mayor que 0, busca en la mitad superior.

			aumento++;

		}

		else if (miarray[indicemitad] > buscar && longitud > 0) {// Si el valor de la mitad es menor, y la longitud es//
																	// mayor que 0, busca en la mitad inferior.

			decremento--;

		}

		return encontrarposicion(miarray, aumento, decremento, buscar);

	}

	public static int sacarposicion(double[] miarray, int inicio, int ultimo, double buscar) {

		int aumento = inicio;

		int decremento = ultimo;

		int indicemitad = (int) Math.floor(((ultimo + inicio) / 2) - 1);

		int longitud = (ultimo - inicio);

		if (miarray[indicemitad] == buscar && longitud == 0) {

			return indicemitad + 1;

		}

		else if (miarray[indicemitad] == buscar && longitud > 0) {

			return indicemitad + 1;

		}

		else if (miarray[indicemitad] != buscar && longitud == 0) {

			return -1;

		}

		else if (miarray[indicemitad] < buscar && longitud > 0) {

			aumento++;

		}

		else if (miarray[indicemitad] > buscar && longitud > 0) {

			decremento--;

		}

		return sacarposicion(miarray, aumento, decremento, buscar);

	}

}
