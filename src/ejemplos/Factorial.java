package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int n=1;
		boolean error=false;
		
		do {
			try {
				System.out.println("Introduzca un número positivo: ");
				n = teclado.nextInt();
				error=false; 
			} catch (InputMismatchException e) {
				System.out.println("Error");
				teclado.nextLine();
				error=true; 
			}			
		} while (n<0 || error);
		
		System.out.println(factorial(n));
		teclado.close();

	}
	public static int factorial(int n){
		
		int resultado; 
		
		if(n==1) //Caso base: devuelve un 1
			resultado=1;
		else	//Caso recursivo
			resultado=n*factorial(n-1);
			
		return resultado; 
	}

}
