package urijudge.iniciante;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		int A, B, PROD;
		Scanner read = new Scanner(System.in);
		
		A = read.nextInt();
		B = read.nextInt();
		PROD = A * B;
		
		System.out.println("PROD = "+PROD);
		
		read.close();

	}

}
