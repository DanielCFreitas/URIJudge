package urijudge.iniciante;

import java.util.Scanner;

public class QuadradoDePares {

	public static void main(String[] args) {
		int n, cont = 1;
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		read.close();

		while (cont <= n) {
			if (cont % 2 == 0) {
				System.out.printf("%d^2 = %.0f\n", cont, Math.pow(cont, 2));
			}
			cont++;
		}

	}

}
