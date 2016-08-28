package urijudge.iniciante;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		int valor, reais, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
		Scanner read = new Scanner(System.in);

		valor = read.nextInt();
		reais = valor;

		read.close();

		while (valor != 0) {
			if (valor >= 100) {
				nota100 += 1;
				valor -= 100;
			} else if (valor >= 50) {
				nota50 += 1;
				valor -= 50;
			} else if (valor >= 20) {
				nota20 += 1;
				valor -= 20;
			} else if (valor >= 10) {
				nota10 += 1;
				valor -= 10;
			} else if (valor >= 5) {
				nota5 += 1;
				valor -= 5;
			} else if (valor >= 2) {
				nota2 += 1;
				valor -= 2;
			} else {
				nota1 += 1;
				valor -= 1;
			}
		}

		System.out.printf("%d\n%d nota(s) de R$ 100,00\n" + "%d nota(s) de R$ 50,00\n" + "%d nota(s) de R$ 20,00\n"
				+ "%d nota(s) de R$ 10,00\n" + "%d nota(s) de R$ 5,00\n" + "%d nota(s) de R$ 2,00\n"
				+ "%d nota(s) de R$ 1,00\n", reais, nota100, nota50, nota20, nota10, nota5, nota2, nota1);
	}

}
