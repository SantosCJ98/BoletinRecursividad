package codigo;

import static teclado.Teclado.readString;

public class Ej5_iterativo {
	
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
		
		int espacios = 0;
		
		for (int i = 0; i < c.length(); i++) {
			
			if (c.charAt(i) == ' ') {
				
				espacios++;
				
			}
			
		}
		
		boolean palindromo = true;
		
		if (espacios == 0) {
			
			int i = 0;
			
			int j = c.length()-1;
		
		while (i < c.length() && j >= 0 && palindromo == true) {
		
			if (String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(i)).equals(String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(j)))) {
				
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
			
			int j = c.length()-1 - espacios;
			
			while (i < c.length() - espacios && j >= 0 && palindromo == true) {
			
				if (String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(i)).equals(String.valueOf(c.replaceAll("[ ]", "").toLowerCase().charAt(j)))) {
					
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
