package urijudge.iniciante;

import java.util.Scanner;

public class Resto2 {

	public static void main(String[] args) {
		int N, cont = 1;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();

		read.close();
		while (cont <= 10000) {
			if (cont % N == 2) {
				System.out.printf("%d\n", cont);
			}
			cont += 1;
		}
	}

}
