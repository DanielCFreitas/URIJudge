package urijudge.iniciante;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		int raio;
		final double PI = 3.14159;
		Scanner read = new Scanner(System.in);

		raio = read.nextInt();

		read.close();
		
		System.out.printf("VOLUME = %.3f\n", 4 / 3.0 * PI * Math.pow(raio, 3));
	}

}
