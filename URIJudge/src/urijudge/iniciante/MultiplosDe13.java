package urijudge.iniciante;

import java.util.Scanner;

public class MultiplosDe13 {

	public static void main(String[] args) {
		int X, Y, aux;
		Scanner read = new Scanner(System.in);

		X = read.nextInt();
		Y = read.nextInt();
		if (X > Y) {
			aux = X;
			X = Y;
			Y = aux;
		}
		aux = 0;
		while (X <= Y) {
			if (X % 13 != 0) {
				aux += X;
			}
			X++;
		}

		read.close();

		System.out.printf("%d\n", aux);
	}

}