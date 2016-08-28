package urijudge.iniciante;

import java.util.Scanner;

public class RestoDaDivisao {

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
		read.close();
		X++;
		while (X < Y) {
			if (X % 5 == 2 || X % 5 == 3) {
				System.out.printf("%d\n", X);
			}
			X++;
		}

	}

}
