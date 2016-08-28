package urijudge.iniciante;

import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		double A, B, C, delta;
		Double x1, x2;
		Scanner read = new Scanner(System.in);

		A = read.nextDouble();
		B = read.nextDouble();
		C = read.nextDouble();

		read.close();

		delta = Math.pow(B, 2) - 4 * A * C;

		

		x1 = (-B + Math.sqrt(delta)) / (2 * A);
		x2 = (-B - Math.sqrt(delta)) / (2 * A);
		
		if (x1.isNaN() || x2.isNaN()){
			System.out.printf("Impossivel calcular\n");
		} else {
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
		}

	}

}
