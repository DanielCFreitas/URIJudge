package urijudge.iniciante;

import java.util.Scanner;

public class DivisoresI {

	public static void main(String[] args) {
		int N;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();

		for (int x = 1; x <= N; x++) {
			if (N % x == 0) {
				System.out.printf("%d\n", x);
			}
		}
		read.close();

	}

}
