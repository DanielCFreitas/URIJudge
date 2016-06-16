package urijudge.iniciante;

import java.util.Scanner;

public class UltrapassandoZ {

	public static void main(String[] args) {
		int X, Z, valorAtual = 0, cont = 0;
		Scanner read = new Scanner(System.in);

		X = read.nextInt();
		Z = read.nextInt();

		while (Z <= X) {
			Z = read.nextInt();
		}

		while (valorAtual < Z) {
			valorAtual += X;
			cont++;
			X++;
		}

		read.close();
		
		System.out.printf("%d\n", cont);
	}

}
