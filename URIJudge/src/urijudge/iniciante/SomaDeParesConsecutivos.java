package urijudge.iniciante;

import java.util.Scanner;

public class SomaDeParesConsecutivos {

	public static void main(String[] args) {
		int X;
		Scanner read = new Scanner(System.in);

		X = read.nextInt();

		while (X != 0) {
			if (X % 2 != 0) {
				X++;
			}
			System.out.printf("%d\n", X + X + 2 + X + 4 + X + 6 + X + 8);
			X = read.nextInt();
		}

		read.close();
	}

}
