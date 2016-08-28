package urijudge.iniciante;

public class NumerosPares {

	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.printf("%d\n", x);
			}
			x += 1;
		}

	}

}
