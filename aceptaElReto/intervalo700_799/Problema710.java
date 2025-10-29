package intervalo700_799;

import java.util.Scanner;

public class Problema710 {

	/**
	 * Acepta el reto 710 - Plazas disponibles en el mundial
	 */
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int numCasos = entrada.nextInt();

			for (int i = 0; i < numCasos; i++) {
				resolverCaso(entrada);
			}
		}
	}

	private static void resolverCaso(Scanner entrada) {
		int numEquipos = entrada.nextInt();

		// Suma directa de todas las plazas asignadas
		int totalPlazas = entrada.nextInt() +
				entrada.nextInt() +
				entrada.nextInt() +
				entrada.nextInt() +
				entrada.nextInt() +
				entrada.nextInt();

		System.out.println(numEquipos - totalPlazas);
	}
	
}
