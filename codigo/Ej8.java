package codigo;

import static teclado.Teclado.*;

//Pedir por teclado el número de discos con los que jugar. Si solo hay un disco, moverlo desde la varilla inicial a la final.
//Si hay más de uno, mover los discos de la varilla inicial a la final, utilizando una tercera como temporal, y sin que haya un disco más grande encima de otro.

public class Ej8 {

	public static void main(String[] args) {

		System.out.println("Introduce el número de discos");

		int numdiscos = readEqui(1, Equivalencias.MAYORIGUAL);

		juegodehanoi(numdiscos, 1, 2, 3);

	}

	public static void juegodehanoi(int numdiscos, int varillainicial, int varillatemp, int varillafinal) {

		if (numdiscos == 1) {

			System.out.println(varillainicial + "----->" + varillafinal);

		}

		else {

			juegodehanoi(numdiscos - 1, varillainicial, varillafinal, varillatemp);

			System.out.println(varillainicial + "----->" + varillafinal);

			juegodehanoi(numdiscos - 1, varillatemp, varillainicial, varillafinal);

		}

	}

}
