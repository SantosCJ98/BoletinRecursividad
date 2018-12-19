package codigo;

import static teclado.Teclado.*;

import static codigo.Ej3.fibonacci;

public class Ej3b {

	public static void main(String[] args) {
		
		int res = 0;
		
		System.out.println("Escribe un número:");
		
		int num = readInt();
	
		System.out.println("Indice: " + posicion(num) + "\nNúmero de Fibonacci: " + mayor(num));
		
		
	}
	
	public static int posicion (int num) {
		
		int indice = 0;
		
		boolean encontrado = false;
		
		int i = 0;
		
		while (!encontrado) {
			
			if (fibonacci(i) >= num) {
				
				indice = i;
				
				encontrado = true;
				
			}
			
			else {
				
				i++;
				
			}
			
		}
	
		return indice;
	
	}
	
	public static int mayor (int num) {
		
		int res = 0;
		
		boolean encontrado = false;
		
		int i = 0;
		
		while (!encontrado) {
			
			if (fibonacci(i) >= num) {
				
				res = fibonacci(i);
				
				encontrado = true;
				
			}
			
			else {
				
				i++;
				
			}
			
		}
	
		return res;
	
	}
	
}
	

