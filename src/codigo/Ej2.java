package codigo;

import static teclado.Teclado.*;

public class Ej2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el primer número:");
		
		int x = readInt();
		
		System.out.println("Introduce el segundo número:");
		
		int y = readInt();
		
		System.out.println("El máximo común divisor de " + x  +" y " + y + " es: " + gcd(x, y));

	}
	
	public static int gcd (int x, int y) {
		
		if (y == 0) {
			
			return x;
			
		}
		
		else {
			
			return gcd(y, x%y);
			
		}
		
	}

}
