package urijudge.iniciante;

import java.util.Scanner;
public class Media1 {

	public static void main(String[] args) {
		double nota1, nota2, media;
		final double PESO1 = 3.5;
		final double PESO2 = 7.5;
		
		Scanner read = new Scanner(System.in);
		
		nota1 = read.nextDouble();
		nota2 = read.nextDouble();
		
		media = (nota1 * PESO1 + nota2 * PESO2)/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		read.close();
	}

}
