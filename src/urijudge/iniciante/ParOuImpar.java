package urijudge.iniciante;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		int valor, numLido;
		Scanner read = new Scanner(System.in);

		valor = read.nextInt();

		while (valor != 0) {
			numLido = read.nextInt();
			if (numLido == 0) {
				System.out.printf("NULL\n");
			} else {
				if (numLido % 2 == 0) {
					System.out.printf("EVEN ");
				} else {
					System.out.printf("ODD ");
				}

				if (numLido > 0) {
					System.out.printf("POSITIVE\n");
				} else if (numLido < 0) {
					System.out.printf("NEGATIVE\n");
				}
			}
			valor -= 1;
		}
		
		read.close();

	}

}
