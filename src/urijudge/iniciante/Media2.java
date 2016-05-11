package urijudge.iniciante;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		double A, B, C, MEDIA;
		final double PESO1 = 2.0;
		final double PESO2 = 3.0;
		final double PESO3 = 5.0;
		
		Scanner read = new Scanner(System.in);
		
		A = read.nextDouble();
		B = read.nextDouble();
		C = read.nextDouble();
		
		MEDIA = (A*PESO1+B*PESO2+C*PESO3)/10;
		
		System.out.printf("MEDIA = %.1f\n",MEDIA);
		read.close();

	}

}
