package urijudge.iniciante;

import java.util.Scanner;

public class SomaDeImparesConsecutivos3 {

	public static void main(String[] args) {
		int N, X, Y, soma;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();

		while (N != 0) {
			soma = 0;
			X = read.nextInt();
			Y = read.nextInt();
			while (Y != 0) {
				if (X % 2 == 0) {
					X++;
				}
				soma += X;
				X += 2;
				Y--;
			}
			System.out.printf("%d\n", soma);
			N--;
		}
		read.close();

	}

}
