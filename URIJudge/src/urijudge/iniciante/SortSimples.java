package urijudge.iniciante;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		int n1, n2, n3, aux;
		int[] numeros = new int[3];

		Scanner read = new Scanner(System.in);

		n1 = read.nextInt();
		n2 = read.nextInt();
		n3 = read.nextInt();

		read.close();

		numeros[0] = n1;
		numeros[1] = n2;
		numeros[2] = n3;

		for (int x = 0; x < numeros.length; x++) {
			aux = numeros[x];
			for (int y = 0; y < numeros.length - 1; y++) {
				if (numeros[y] > numeros[y + 1]) {
					aux = numeros[y];
					numeros[y] = numeros[y + 1];
					numeros[y + 1] = aux;
				}
			}
		}
		System.out.printf("%d\n%d\n%d\n\n", numeros[0], numeros[1], numeros[2]);

		System.out.printf("%d\n%d\n%d\n", n1, n2, n3);
	}

}
