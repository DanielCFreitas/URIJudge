package urijudge.iniciante;

import java.util.Scanner;

public class DividindoXporY {

	public static void main(String[] args) {
		double X, Y;
		int qntd;
		Scanner read = new Scanner(System.in);

		qntd = read.nextInt();

		while (qntd != 0) {
			X = read.nextDouble();
			Y = read.nextDouble();
			if (Y == 0) {
				System.out.printf("divisao impossivel\n");
			} else {
				System.out.printf("%.1f\n", X / Y);
			}
			qntd--;
		}
		read.close();

	}

}
