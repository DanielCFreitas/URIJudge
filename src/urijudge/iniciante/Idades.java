package urijudge.iniciante;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		double idade, quantidadeDeIdades = 0, soma = 0;

		Scanner read = new Scanner(System.in);

		idade = read.nextInt();

		while (idade >= 0) {
			soma += idade;
			quantidadeDeIdades++;
			idade = read.nextInt();
		}

		read.close();

		System.out.printf("%.2f\n", soma / quantidadeDeIdades);

	}

}
