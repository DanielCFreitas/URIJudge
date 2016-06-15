package urijudge.iniciante;

import java.util.Scanner;

public class SequenciasCrescentes {

	public static void main(String[] args) {
		int x, sequencia = 1;
		StringBuilder sb = new StringBuilder();
		Scanner read = new Scanner(System.in);

		x = read.nextInt();

		while (x != 0) {
			if (x > sequencia) {
				sb.append(sequencia + " ");
				sequencia++;
			} else if (x == sequencia) {
				sb.append(sequencia);
				System.out.println(sb);
				x = read.nextInt();
				sequencia = 1;
				sb.delete(0, sb.length());
			} else {
				sequencia++;
			}
		}
		read.close();
	}

}
