package urijudge.iniciante;

import java.util.Scanner;

public class SequenciaLogica {

	public static void main(String[] args) {
		int n1, inicio = 1;
		Scanner read = new Scanner(System.in);

		n1 = read.nextInt();

		for (; inicio <= n1; inicio++) {
			System.out.printf("%d %.0f %.0f\n", inicio, Math.pow(inicio, 2), Math.pow(inicio, 3));
			System.out.printf("%d %.0f %.0f\n", inicio, Math.pow(inicio, 2) + 1, Math.pow(inicio, 3) + 1);
		}

		read.close();
	}

}
