package urijudge.iniciante;

import java.util.Scanner;

public class VariasNotasComValidacao {

	public static void main(String[] args) {
		double nota1 = -1, nota2 = -1;
		int continuar = 1;
		Scanner read = new Scanner(System.in);

		while (continuar == 1) {
			nota1 = read.nextDouble();
			while (nota1 < 0 || nota1 > 10) {
				System.out.printf("nota invalida\n");
				nota1 = read.nextDouble();
			}
			nota2 = read.nextDouble();
			while (nota2 < 0 || nota2 > 10) {
				System.out.printf("nota invalida\n");
				nota2 = read.nextDouble();
			}

			System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
			System.out.printf("novo calculo (1-sim 2-nao)\n");
			continuar = read.nextInt();
			while (continuar != 1 && continuar != 2) {
				System.out.printf("novo calculo (1-sim 2-nao)\n");
				continuar = read.nextInt();
			}
		}

		read.close();
	}

}
