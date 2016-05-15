package urijudge.iniciante;

import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {
		int horas, velocidade;

		Scanner read = new Scanner(System.in);

		horas = read.nextInt();
		velocidade = read.nextInt();

		read.close();

		System.out.printf("%.3f\n", (horas * velocidade) / 12.0);
	}

}
