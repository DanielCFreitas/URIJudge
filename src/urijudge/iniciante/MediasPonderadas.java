package urijudge.iniciante;

import java.util.Scanner;

public class MediasPonderadas {

	public static void main(String[] args) {
		int N;
		double n1, n2, n3;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();

		for (; N != 0; N--) {
			n1 = read.nextDouble();
			n2 = read.nextDouble();
			n3 = read.nextDouble();

			System.out.printf("%.1f\n", (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5));
		}
		read.close();

	}

}
