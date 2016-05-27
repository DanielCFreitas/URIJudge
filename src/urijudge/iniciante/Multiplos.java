package urijudge.iniciante;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int A, B;
		Scanner read = new Scanner(System.in);

		A = read.nextInt();
		B = read.nextInt();

		read.close();		
		
		if (B % A == 0 || A % B ==0) {
			System.out.printf("Sao Multiplos\n");
		} else {
			System.out.printf("Nao sao Multiplos\n");
		}

	}

}
