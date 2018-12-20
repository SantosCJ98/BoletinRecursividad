package codigo;

import static teclado.Teclado.*;

public class Ej1 {
	
	//Pedir la base y el exponente (mayor o igual que cero) por teclado. Si el exponente es 0, se devuelve 1. Si es 1, se devuelve la base.
	//En caso contrario, ir multiplicando la base tantas veces como indique el exponente.

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
