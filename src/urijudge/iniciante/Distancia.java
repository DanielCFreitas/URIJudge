package urijudge.iniciante;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		int distancia;
		Scanner read = new Scanner(System.in);

		distancia = read.nextInt();

		read.close();

		System.out.printf("%d minutos\n", 2 * distancia);
	}

}
