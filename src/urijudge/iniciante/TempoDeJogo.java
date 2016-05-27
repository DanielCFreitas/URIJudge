package urijudge.iniciante;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		int h1, h2;
		Scanner read = new Scanner(System.in);

		h1 = read.nextInt();
		h2 = read.nextInt();

		read.close();
		if (h1 < h2) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", h2 - h1);
		} else if (h1 == h2) {
			System.out.printf("O JOGO DUROU 24 HORA(S)\n");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - h1) + h2);
		}

	}

}
