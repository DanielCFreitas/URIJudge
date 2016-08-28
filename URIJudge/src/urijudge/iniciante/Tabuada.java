package urijudge.iniciante;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int N;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();
		read.close();

		for (int num = 1; num <= 10; num++) {
			System.out.printf("%d x %d = %d\n", num, N, N * num);
		}

	}

}
