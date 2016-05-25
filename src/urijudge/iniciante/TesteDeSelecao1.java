package urijudge.iniciante;

import java.util.Scanner;

public class TesteDeSelecao1 {

	public static void main(String[] args) {
		int A, B, C, D;
		Scanner read = new Scanner(System.in);

		A = read.nextInt();
		B = read.nextInt();
		C = read.nextInt();
		D = read.nextInt();

		read.close();
		
		if (B > C && D > A && (C+D) > (A+B) && C >-1 && D>-1 && A%2 == 0){
			System.out.printf("Valores aceitos\n");
		} else {
			System.out.printf("Valores nao aceitos\n");
		}

	}

}
