package urijudge.iniciante;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int casosDeTeste = read.nextInt();
		int x, numeroAtual, soma;

		while (casosDeTeste != 0) {
			soma = 0;
			x = read.nextInt();
			numeroAtual = x - 1;

			while (numeroAtual != 0) {
				if (x % numeroAtual == 0) {
					soma += numeroAtual;
				}
				numeroAtual--;
			}

			if (soma == x) {
				System.out.printf("%d eh perfeito\n", x);
			} else {
				System.out.printf("%d nao eh perfeito\n", x);
			}

			casosDeTeste--;
		}

		read.close();
	}

}
