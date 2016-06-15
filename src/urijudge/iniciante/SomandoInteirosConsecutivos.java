package urijudge.iniciante;

import java.util.Scanner;

public class SomandoInteirosConsecutivos {

	public static void main(String[] args) {
		int N, A, soma = 0;
		Scanner read = new Scanner(System.in);

		A = read.nextInt();
		
		N = read.nextInt();
		while (N <= 0) {
			N = read.nextInt();
		}
		
		while (N != 0) {			
			soma += A;
			A++;
			N--;
		}

		System.out.printf("%d\n", soma);
		read.close();

	}

}
