package urijudge.iniciante;

import java.util.Scanner;

public class SelecaoEmVetorI {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Double[] lista = new Double[100];

		for (int i = 0; i < 100; i++) {
			lista[i] = read.nextDouble();
		}

		for (int i = 0; i < 100; i++) {
			if (lista[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, lista[i]);
			}
		}

		read.close();
	}
}
