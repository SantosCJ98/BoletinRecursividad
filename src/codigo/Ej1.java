package codigo;

import static teclado.Teclado.*;

public class Ej1 {

	public static void main(String[] args) {
	
		System.out.println("Introduce la base:");
		
		int base = readInt();
		
		System.out.println("Introduce el exponente:");
		
		int exponente = readEqui(0, Equivalencias.MAYORIGUAL);
		
		System.out.println("El resultado es: " + potencia(base, exponente));

	}
	
	public static int potencia (int base, int exponente) {
		
		if (exponente == 1) {
			
			return base;
			
		}
		
		else if (exponente == 0) {
			
			return 1;
			
		}
		
		else {
			
			return base * potencia(base, exponente-1);
					
			}
			
		}
		
	}
