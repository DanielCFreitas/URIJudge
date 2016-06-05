package urijudge.iniciante;

import java.util.Scanner;

public class PUM {

    public static void main(String[] args){
		int N, numero = 1;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();
		read.close();
		
		while (N!= 0){
			System.out.printf("%d %d %d PUM\n", numero, numero+1, numero+2);
			numero+=4;
			N--;
		}

    }
 
}
