package urijudge.iniciante;

import java.util.Scanner;

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		int casosDeTeste;
		long populacaoA, populacaoB;
		double g1, g2;
		Scanner read = new Scanner(System.in);

		do {
			casosDeTeste = read.nextInt();
		} while (casosDeTeste < 1 || casosDeTeste > 3000);

		while (casosDeTeste > 0) {
			int ano = 0;

			do {
				populacaoA = Long.parseLong(read.nextLine());
			} while (populacaoA < 100 || populacaoA > 1000000);

			do {
				populacaoB = Long.parseLong(read.nextLine());
			} while (populacaoB < populacaoA || populacaoB > 1000000);

			do {
				g1 = Double.parseDouble(read.nextLine());
			} while (g1 < 0.1 || g1 > 10.0);

			do {
				g2 = Double.parseDouble(read.nextLine());
			} while (g2 < 0.0 || g2 > 10.0 || g2 > g1);

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
