package urijudge.iniciante;

import java.util.Scanner;

public class SequenciaLogica2 {

	public static void main(String[] args) {
		int x, y, cont = 0;
		Scanner read = new Scanner(System.in);

		x = read.nextInt();
		y = read.nextInt();

		for (int n = 1; n <= y; n++) {
			if (cont + 1 == x) {
				System.out.printf("%d\n", n);
				cont = 0;
			} else {
				System.out.printf("%d ", n);
				cont++;
			}
		}
		read.close();
	}

}
