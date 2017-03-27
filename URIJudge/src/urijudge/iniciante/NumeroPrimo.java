package urijudge.iniciante;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int casosDeTeste = read.nextInt();
		int numeroTeste, numeroAtual, divisoesEncontradas;

		while (casosDeTeste != 0) {

			divisoesEncontradas = 0;
			numeroTeste = read.nextInt();
			numeroAtual = numeroTeste;

			while (numeroAtual != 0) {

				if (numeroTeste % numeroAtual == 0) {
					divisoesEncontradas++;
				}

				numeroAtual--;
			}

			if (divisoesEncontradas == 2) {
				System.out.printf("%d eh primo\n", numeroTeste);
			} else {
				System.out.printf("%d nao eh primo\n", numeroTeste);
			}

			casosDeTeste--;
		}

		read.close();
	}
}
