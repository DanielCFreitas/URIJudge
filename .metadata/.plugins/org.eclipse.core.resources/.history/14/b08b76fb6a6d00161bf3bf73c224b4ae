package urijudge.iniciante;

import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {
		double nota, media = 0, quantidade = 0;
		Scanner read = new Scanner(System.in);

		while (quantidade != 2) {
			nota = read.nextDouble();
			if (nota > 10 || nota < 0) {
				System.out.printf("nota invalida\n");
			} else {
				media += nota;
				quantidade++;
			}
		}
		read.close();

		System.out.printf("media = %.2f\n", media / 2);
	}

}
