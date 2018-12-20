package codigo;

//Rellenar un array de numeros decimales por teclado. Ordenar el array de menor a mayor. Buscar un elemento del array, en la posicion de la mitad.
//Si el elemento a buscar es mayor a este, buscar en la mitad superior. Si es menor, buscar en la inferior.
//Si lo encuentra, mostrar el indice en el que aparace.

import static teclado.Teclado.*;

public class Ej7 {

	public static void main(String[] args) {

		System.out.println("Introduce la longitud del array");
		
		int n = readEqui(0, Equivalencias.MAYOR);

		System.out.println("¿Qué numero vas a buscar?");
		
		double buscar = readDouble();
		
		double [] miarray = new double [n];
		
		rellenararray(miarray);
		
		double [] ordenado = burbuja(miarray);
		
		mostrararray(ordenado);
		
		if (encontrarposicion(ordenado, 1, ordenado.length, buscar)) {
			
			System.out.println("El elemento " + buscar + " se encuentra en la posicion " + sacarposicion(ordenado, 1, ordenado.length, buscar) + " del array");
			
		}
		
		else {
			
			System.out.println("El elemento " + buscar + " no se encuentra en el array");
			
		}
		
		
	
		
	}
	
	public static double [] rellenararray (double [] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.println("Indice " + (i+1) +": ");
			
			miarray[i] = readDouble();
			
		}
		
		return miarray;
		
	}
	
	public static void mostrararray (double [] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.print(miarray[i] + "   ");
			
		}
		
		System.out.println();
		
	}
	
	public static double [] burbuja (double [] miarray) {
		
		for (int i = 0; i < miarray.length - 1; i++) {
				
				for (int j = i + 1; j < miarray.length; j++) {
					
					if (miarray[j] < miarray[i]) {
						
						 double aux = miarray[j];
						
						miarray[j] = miarray[i];
						
						miarray[i] = aux;
						
					
					}
					
				}
				
			}
		
		return miarray;
			
		}
	
	public static boolean encontrarposicion (double [] miarray, int inicio, int ultimo, double buscar) {
		
		int aumento = inicio;
		
		int decremento = ultimo;
		
		int indicemitad = (int)Math.floor(((ultimo+inicio)/2)-1);
		
		int longitud = (ultimo-inicio);
		
		if (miarray[indicemitad] == buscar && longitud == 0) {
			
			return true;
			
		}
		
		else if (miarray[indicemitad] == buscar && longitud > 0) {
			
			return true;
			
		}
		
		else if (miarray[indicemitad] != buscar && longitud == 0) {
			
			return false;
			
		}
		
		else if (miarray[indicemitad] < buscar && longitud > 0) {
			
			aumento++;
			
		}
		
		else if (miarray[indicemitad] > buscar && longitud > 0) {
			
			decremento--;
			
		}
		
		return encontrarposicion(miarray, aumento, decremento, buscar);
		
	
}
	
	public static int sacarposicion (double [] miarray, int inicio, int ultimo, double buscar) {
		
		int aumento = inicio;
		
		int decremento = ultimo;
		
		int indicemitad = (int)Math.floor(((ultimo+inicio)/2)-1);
		
		int longitud = (ultimo-inicio);
		
		if (miarray[indicemitad] == buscar && longitud == 0) {
			
			return indicemitad+1;
			
		}
		
		else if (miarray[indicemitad] == buscar && longitud > 0) {
			
			return indicemitad+1;
			
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
	

	


