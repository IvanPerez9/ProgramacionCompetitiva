package intervalo700_799;

import java.util.Scanner;

public class Problema707 {

	/**
	 * Acepta el reto 707 - La batalla por la tierra media
	 */
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			while (entrada.hasNext()) {
				int aliados = entrada.nextInt();
				int nEnemigos = entrada.nextInt();

				int[] criaturas = new int[nEnemigos];
				for (int i = 0; i < nEnemigos; i++) {
					criaturas[i] = entrada.nextInt();
				}

				int izq = 1;
				int der = 1000000000;
				int resultado = der;

				while (izq <= der) {
					int mid = izq + (der - izq) / 2;

					if (esPosible(criaturas, aliados, mid)) {
						resultado = mid;
						der = mid - 1;
					} else {
						izq = mid + 1;
					}
				}
				System.out.println(resultado);
			}
		}
	}

	private static boolean esPosible(int[] criaturas, int aliados, int maxPorPersona) {
		long necesarios = 0;

		for (int cantidad : criaturas) {
			necesarios += (cantidad + maxPorPersona - 1) / maxPorPersona;

			if (necesarios > aliados) {
				return false;
			}
		}
		return necesarios <= aliados;
	}

}
