package urijudge.iniciante;

import java.util.Scanner;

public class MaiorEPosicao {

	public static void main(String[] args) {
		int valor = 0, maior, posicao = 1;
		Scanner read = new Scanner(System.in);

		maior = read.nextInt();
		for (int x = 2; x <= 100; x++) {
			valor = read.nextInt();
			if (valor > maior) {
				maior = valor;
				posicao = x;
			}			
		}
		read.close();

		System.out.printf("%d\n%d\n", maior, posicao);

	}

}
