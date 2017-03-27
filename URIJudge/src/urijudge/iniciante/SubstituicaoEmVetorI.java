package urijudge.iniciante;

import java.util.Scanner;

public class SubstituicaoEmVetorI {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Integer vetor[] = new Integer[10];

		for (int x = 0; x <= 9; x++) {
			vetor[x] = read.nextInt();
		}

		for (int x = 0; x <= 9; x++) {
			if (vetor[x] == null || vetor[x] <= 0) {
				vetor[x] = 1;
			}
			System.out.printf("X[%d] = %d\n", x, vetor[x]);
		}

		read.close();
	}
}
