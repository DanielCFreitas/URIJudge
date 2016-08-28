package urijudge.iniciante;

import java.util.Scanner;

public class PositivosEMedia {

	public static void main(String[] args) {
		double valor, total = 0;
		int positivos = 0;
		Scanner read = new Scanner(System.in);

		for (int x = 0; x <= 5; x++) {
			valor = read.nextDouble();
			if (valor >= 0) {
				total += valor;
				positivos += 1;
			}
		}
		read.close();

		System.out.printf("%d valores positivos\n%.1f\n", positivos, total / positivos);

	}

}
