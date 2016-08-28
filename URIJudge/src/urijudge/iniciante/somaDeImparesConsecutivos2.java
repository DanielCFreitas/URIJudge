package urijudge.iniciante;

import java.util.Scanner;

public class somaDeImparesConsecutivos2 {

	public static void main(String[] args) {
		int quantidadeDeComparacoes, n, y, aux, somaDosImpares;
		Scanner read = new Scanner(System.in);

		quantidadeDeComparacoes = read.nextInt();

		while (quantidadeDeComparacoes != 0) {
			somaDosImpares = 0;
			n = read.nextInt();
			y = read.nextInt();
			if (y != n) {
				if (y < n) {
					aux = y;
					y = n;
					n = aux;
				}
				n += 1;
				while (n != y) {
					if (n % 2 != 0) {
						somaDosImpares += n;
					}
					n += 1;
				}
			}
			System.out.printf("%d\n", somaDosImpares);
			quantidadeDeComparacoes -= 1;
		}

		read.close();
	}

}
