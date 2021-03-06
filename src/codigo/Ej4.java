package codigo;

import static teclado.Teclado.*;

//Pedir una cadena por teclado. Si la cadena solo tiene un caracter, devolver la cadena.
//En caso contrario, invertirla.

public class Ej4 {

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena");
		
		String c = readString();
		
		System.out.println("La cadena invertida es " + invertircadena(c));

	}
	
	public static String invertircadena (String c) {
		
		if (c.length() == 1) {
			
			return c;
			
		}
		
		else {
			
			return invertircadena(c.substring(1)) + c.charAt(0);
			
		}
		
	}

}
