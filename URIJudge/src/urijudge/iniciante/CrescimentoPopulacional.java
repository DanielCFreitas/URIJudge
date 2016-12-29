package urijudge.iniciante;

import java.util.Scanner;

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		int casosDeTeste;
		long populacaoA, populacaoB;
		double g1, g2;
		Scanner read = new Scanner(System.in);

		casosDeTeste = read.nextInt();

		while (casosDeTeste > 0) {
			int ano = 0;

			populacaoA = read.nextLong();
			populacaoB = read.nextLong();
			g1 = read.nextDouble();
			g2 = read.nextDouble();

			while (populacaoA <= populacaoB) {
				populacaoA = (int) (populacaoA + (populacaoA * (g1 / 100)));
				populacaoB = (int) (populacaoB + (populacaoB * (g2 / 100)));

				if (populacaoA <= populacaoB) {
					ano++;
				} else {
					ano++;
					System.out.printf("%d anos.\n", ano);
					break;
				}

				if (ano > 100) {
					System.out.printf("Mais de 1 seculo.\n");
					break;
				}
			}

			casosDeTeste--;
		}

		read.close();

	}
}
