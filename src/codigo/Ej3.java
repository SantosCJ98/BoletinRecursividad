package codigo;

import static teclado.Teclado.*;

public class Ej3 {

	public static void main(String[] args) {
	
		System.out.println("Introduce el elemento de la serie de Fibonacci que desea ver:");
		
		int n = readInt();
		
		System.out.println(fibonacci(n));

	}
	
	public static int fibonacci (int n) {
		
		if (n == 0) {
			
			return 0;
			
		}
		
		else if (n == 1) {
		
			return 1;
			
		}
		
		else {
			
			return fibonacci(n-1) + fibonacci(n-2);
			
		}
		
		
		
	}

}
