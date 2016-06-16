package urijudge.iniciante;

import java.util.Scanner;

public class FibonacciFacil {

	public static void main(String[] args) {
		int N, penultimo = 1, ultimo = 0, aux;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();

		while (N != 0) {
			if (N == 1) {
				System.out.printf("%d\n", ultimo);
				break;
			}
			System.out.printf("%d ", ultimo);

			aux = ultimo;
			ultimo = penultimo + ultimo;
			penultimo = aux;
			N--;
		}

		read.close();
	}

}
