package codigo;

import static teclado.Teclado.*;

//Pedir por teclado el número de discos con los que jugar. Si solo hay un disco, moverlo desde la varilla inicial a la final.
//Si hay más de uno, mover los discos de la varilla inicial a la final, utilizando una tercera como temporal, y sin que haya un disco más grande encima de otro.

public class Ej8 {

	public static void main(String[] args) {

		// Se pide el número de discos (debe haber uno por lo menos)

		System.out.println("Introduce el número de discos");

		int numdiscos = readEqui(1, Equivalencias.MAYORIGUAL);

		// Se inicia el juego.

		juegodehanoi(numdiscos, 1, 2, 3);

	}

	public static void juegodehanoi(int numdiscos, int varillainicial, int varillatemp, int varillafinal) {

		// Si solo hay un disco, se mueve de la varilla inicial a la final

		if (numdiscos == 1) {

			System.out.println(varillainicial + "----->" + varillafinal);

		}

		// Si hay mas de un disco, se mueve de la varilla inicial a la temporal, y de la
		// temporal a la final

		else {

			juegodehanoi(numdiscos - 1, varillainicial, varillafinal, varillatemp);

			System.out.println(varillainicial + "----->" + varillafinal);

			juegodehanoi(numdiscos - 1, varillatemp, varillainicial, varillafinal);

		}

	}

}
