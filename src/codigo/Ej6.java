package codigo;

import static teclado.Teclado.*;

public class Ej6 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la longitud del array");
		
		int n = readEqui(0, Equivalencias.MAYOR);

		int [] miarray = new int [n];
		
		rellenararray(miarray);
		
		mostrararray(miarray);
		
		if (capicua(miarray, 0, miarray.length-1)) {
			
			System.out.println("El array es capicua");
			
		}
		
		else {
			
			System.out.println("El array no es capicua");
			
		}
		
		

	}
	
	public static int [] rellenararray (int [] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.println("Indice " + i +": ");
			
			miarray[i] = readInt();
			
		}
		
		return miarray;
		
	}
	
public static void mostrararray (int [] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.print(miarray[i] + "   ");
			
		}
		
		System.out.println();
		
	}
	
	public static boolean capicua (int [] miarray, int principio, int ultimo) {
		
		if ((miarray.length == 0) || (miarray.length == 1)) {
			
			return true;
			
		}
		
		if (principio >= ultimo) {
			
			return true;
			
		}
		
		if (miarray[principio] != miarray[ultimo]) {
			
			return false;
			
		}
		
		return capicua(miarray, principio + 1, ultimo - 1);
	
	}

}
