package intervalo600_699;

import java.util.Scanner;

public class Problema622 {

	static final String IMPOSIBLE = "IMPOSIBLE";

	/**
	 * Acepta el reto 622 - La media prometida
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numExamenes, sumNotas, notaPadres, posible;
		while (true) {
			numExamenes = entrada.nextInt();
			// No hay examenes
			if (numExamenes == 0) {
				break;
			}
			sumNotas = 0;
			for (int i = 0; i < numExamenes; i++) {
				sumNotas += entrada.nextInt();
			}
			
			notaPadres = entrada.nextInt();
			posible = notaPadres * (numExamenes + 1);
			
			if (sumNotas > posible || (sumNotas + 10) < posible) {
                System.out.println(IMPOSIBLE);
            } else {
                System.out.println(posible - sumNotas);
            }
		}
		entrada.close();
	}
}
