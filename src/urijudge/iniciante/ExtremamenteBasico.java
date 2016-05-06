package urijudge.iniciante;

import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		int A, B, X;
		
		Scanner read = new Scanner(System.in);		
		A = read.nextInt();
		B = read.nextInt();
		
		X = A + B;
		
		System.out.println("X = "+X);
		read.close();
	}

}
