package urijudge.iniciante;

import java.util.Scanner;

public class CrescenteEDecrescente {

	public static void main(String[] args) {
		int X, Y;
		Scanner read = new Scanner(System.in);

		X = read.nextInt();
		Y = read.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.printf("Crescente\n");
			} else if (X > Y) {
				System.out.printf("Decrescente\n");
			}
			X = read.nextInt();
			Y = read.nextInt();
		}
		read.close();

	}

}
