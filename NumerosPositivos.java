package urijudge.iniciante;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		double valor;
		int positivos = 0, contador = 0;
		Scanner read = new Scanner(System.in);

		while (contador <= 5) {
			valor = read.nextDouble();
			if (valor > 0) {
				positivos += 1;
			}
			contador += 1;
		}

		read.close();

		System.out.printf("%d valores positivos", positivos);

	}

}
