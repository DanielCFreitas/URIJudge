package urijudge.iniciante;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		double A, B, C;
		Scanner read = new Scanner(System.in);

		A = read.nextDouble();
		B = read.nextDouble();
		C = read.nextDouble();

		read.close();

		if (A + B > C && A + C > B && C + B > A) {
			System.out.printf("Perimetro = %.1f\n", A + B + C);
		} else {
			System.out.printf("Area = %.1f\n", ((A + B) * C) / 2);
		}

	}

}
