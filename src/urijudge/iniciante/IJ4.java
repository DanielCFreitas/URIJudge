package urijudge.iniciante;

public class IJ4 {

	public static void main(String[] args) {
		for (double i = 0, j = 1; i <= 2; i += 0.2, j += 0.2) {
			if (String.valueOf(i).contains(".0") || String.valueOf(i).contains(".9")) {
				System.out.printf("I=%.0f J=%.0f\n", i, j);
				System.out.printf("I=%.0f J=%.0f\n", i, j + 1);
				System.out.printf("I=%.0f J=%.0f\n", i, j + 2);
			} else {
				System.out.printf("I=%.1f J=%.1f\n", i, j);
				System.out.printf("I=%.1f J=%.1f\n", i, j + 1);
				System.out.printf("I=%.1f J=%.1f\n", i, j + 2);
			}
		}
	}

}
