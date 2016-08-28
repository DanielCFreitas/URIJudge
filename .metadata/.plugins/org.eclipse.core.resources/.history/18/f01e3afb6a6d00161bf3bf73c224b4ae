package urijudge.iniciante;

import java.util.Scanner;

public class SomaDeImparesConsecutivos1 {
	public static void main(String[] args) {
		int x, y, aux, xOriginal;
		Scanner read = new Scanner(System.in);

		x = read.nextInt();
		y = read.nextInt();

		read.close();

		if (y < x) {
			aux = y;
			y = x;
			x = aux;
		}
		aux = 0;
		xOriginal = x;
		y -= 1;

		while (x <= y) {
			if (x % 2 != 0 && x != xOriginal) {
				aux = aux + x;
				x++;
			} else {
				x++;
			}
		}

		System.out.printf("%d\n", aux);
	}
}
