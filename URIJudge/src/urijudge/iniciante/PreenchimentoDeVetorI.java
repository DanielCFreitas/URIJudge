package urijudge.iniciante;

import java.util.Scanner;

public class PreenchimentoDeVetorI {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Integer vetor[] = new Integer[10];
		int numero;

		numero = read.nextInt();

		for (int i = 0; i <= 9; i++) {
			vetor[i] = numero;
			numero *= 2;
		}

		for (int i = 0; i <= 9; i++) {
			System.out.printf("N[%d] = %d\n", i, vetor[i]);
		}

		read.close();
	}
}
