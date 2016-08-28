package urijudge.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		double n1, n2, n3, n4, exame, media;

		n1 = read.nextDouble();
		n2 = read.nextDouble();
		n3 = read.nextDouble();
		n4 = read.nextDouble();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

		System.out.printf("Media: %s\n", decimal.format(media).replace(",", ".").trim());
		if (media >= 7) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media < 5) {
			System.out.printf("Aluno reprovado.\n");
		} else {
			System.out.printf("Aluno em exame.\n");
			exame = read.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", exame);
			if ((media + exame) / 2 >= 5) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", (media + exame) / 2);
		}

		read.close();

	}

}
