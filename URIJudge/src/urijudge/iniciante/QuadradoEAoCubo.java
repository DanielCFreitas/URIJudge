package urijudge.iniciante;

import java.util.Scanner;

public class QuadradoEAoCubo {

	public static void main(String[] args) {
		int N, numero = 1;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();
		read.close();

		while (N != 0) {
			System.out.printf("%d %.0f %.0f\n", numero, Math.pow(numero, 2), Math.pow(numero, 3));
			numero++;
			N--;
		}
	}

}
