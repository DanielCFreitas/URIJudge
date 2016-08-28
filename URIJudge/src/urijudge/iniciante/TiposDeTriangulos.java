package urijudge.iniciante;

import java.util.Scanner;

public class TiposDeTriangulos {

	public static void main(String[] args) {
		double A, B, C, aux;
		Scanner read = new Scanner(System.in);

		A = read.nextDouble();
		B = read.nextDouble();
		C = read.nextDouble();

		read.close();

		while (A < B || A < C) {
			if (A < B) {
				aux = A;
				A = B;
				B = aux;
			} else {
				aux = A;
				A = C;
				C = aux;
			}
		}

		if (A >= B + C) {
			System.out.printf("NAO FORMA TRIANGULO\n");
		} else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.printf("TRIANGULO RETANGULO\n");
		} else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.printf("TRIANGULO OBTUSANGULO\n");
		} else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.printf("TRIANGULO ACUTANGULO\n");
		}

		if (A == B && B == C) {
			System.out.printf("TRIANGULO EQUILATERO\n");
		} else if (A == B || C == B || A == C) {
			System.out.printf("TRIANGULO ISOSCELES\n");
		}
	}

}
