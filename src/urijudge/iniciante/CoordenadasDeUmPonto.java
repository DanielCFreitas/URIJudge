package urijudge.iniciante;

import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		double x, y;
		Scanner read = new Scanner(System.in);

		x = read.nextDouble();
		y = read.nextDouble();

		read.close();

		if (x > 0 && y > 0) {
			System.out.printf("Q1\n");
		} else if (x < 0 && y > 0) {
			System.out.printf("Q2\n");
		} else if (x < 0 && y < 0) {
			System.out.printf("Q3\n");
		} else if (x > 0 && y < 0) {
			System.out.printf("Q4\n");
		} else if (x == 0 && y != 0) {
			System.out.printf("Eixo Y\n");
		} else if (x != 0 && y == 0) {
			System.out.printf("Eixo X\n");
		} else {
			System.out.printf("Origem\n");
		}
	}

}
