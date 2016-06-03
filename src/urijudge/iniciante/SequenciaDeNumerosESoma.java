package urijudge.iniciante;

import java.util.Scanner;

public class SequenciaDeNumerosESoma {

	public static void main(String[] args) {
		int M, N, aux;
		Scanner read = new Scanner(System.in);

		M = read.nextInt();
		N = read.nextInt();

		while (M > 0 && N > 0) {
			if (N < M) {
				aux = N;
				N = M;
				M = aux;
			}
			aux = 0;
			while (M <= N) {
				System.out.printf("%d ", M);
				aux += M;
				M++;
			}
			System.out.printf("Sum=%d\n", aux);
			M = read.nextInt();
			N = read.nextInt();
		}
		read.close();

	}

}
