package intervalo700_799;

import java.util.Scanner;

public class Problema717 {

	static final String DIVERTIDOS = "DIVERTIDOS";
	static final String INSULSOS = "INSULSOS";

	/**
	 * Acepta el reto 717 - 31-12-23
	 */
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int numCasos = entrada.nextInt();

			for (int i = 0; i < numCasos; i++) {
				int n1 = entrada.nextInt();
				int n2 = entrada.nextInt();
				int n3 = entrada.nextInt();

				System.out.println(sonDivertidos(n1, n2, n3) ? DIVERTIDOS : INSULSOS);
			}
		}
	}

	private static boolean sonDivertidos(int n1, int n2, int n3) {
		String s1 = String.format("%02d", n1);
		String s2 = String.format("%02d", n2);
		String s3 = String.format("%02d", n3);

		// Permutaciones posibles
		return compare(s1 + s2 + s3) ||
				compare(s1 + s3 + s2) ||
				compare(s2 + s1 + s3) ||
				compare(s2 + s3 + s1) ||
				compare(s3 + s1 + s2) ||
				compare(s3 + s2 + s1);
	}

	private static boolean compare(String str) {
		return str.substring(0, 3).equals(str.substring(3, 6));
	}

}
