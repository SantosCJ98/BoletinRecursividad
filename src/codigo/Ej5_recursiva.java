package codigo;

import static teclado.Teclado.*;

import static codigo.Ej4.invertircadena;

public class Ej5_recursiva {

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena");
		
		String c = readString();
		

		if (palindromo(c)) {
			
			 System.out.println("La cadena es palindroma");
			
		}
		
		else {
			
			System.out.println("La cadena no es palíndroma");
		}
			
			
			
	}
	
	public static boolean palindromo (String c) {
		
		if (c.toLowerCase().replaceAll("[ ]", "").equals(invertircadena(c.toLowerCase().replaceAll("[ ]", "")))) {
			
			return true;
		
		}
		
		else {
			
			return false;
			
		}
		   
		 	}
}
