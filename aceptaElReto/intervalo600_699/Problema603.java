package intervalo600_699;

import java.util.Arrays;
import java.util.Scanner;

public class Problema603 {

	/**
	 * Acepta el reto 603 - El carpintero Ebanisto
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		while (true) {
			int longitud = entrada.nextInt();
			int numCortes = entrada.nextInt();

			// Condición de salida
			if (longitud == 0 && numCortes == 0) break;
			int[] cortes = new int[numCortes + 2];
			cortes[0] = 0;
			cortes[numCortes + 1] = longitud;
			for (int i = 1; i <= numCortes; i++) {
				cortes[i] = entrada.nextInt();
			}
			Arrays.sort(cortes);

			System.out.println(calcularEsfuerzoMinimo(cortes));
		}

		entrada.close();
	}

	private static int calcularEsfuerzoMinimo(int[] cortes) {

		int totalPosiciones = cortes.length;

		int[][] esfuerzoMinimo = new int[totalPosiciones][totalPosiciones];

		// DistanciaIndices = cuántos elementos hay entre inicio y fin
		for (int distanciaIndices = 2; distanciaIndices < totalPosiciones; distanciaIndices++) {
			for (int inicio = 0; inicio + distanciaIndices < totalPosiciones; inicio++) {
				int fin = inicio + distanciaIndices;
				esfuerzoMinimo[inicio][fin] = Integer.MAX_VALUE;

				for (int puntoCorte = inicio + 1; puntoCorte < fin; puntoCorte++) {
					int esfuerzoIzquierda = esfuerzoMinimo[inicio][puntoCorte];
					int esfuerzoDerecha = esfuerzoMinimo[puntoCorte][fin];
					int costeCorteActual = 2 * (cortes[fin] - cortes[inicio]);

					int esfuerzoTotal = esfuerzoIzquierda + esfuerzoDerecha + costeCorteActual;

					// Quedarnos con el mínimo
					esfuerzoMinimo[inicio][fin] = Math.min(esfuerzoMinimo[inicio][fin], esfuerzoTotal);
				}
			}
		}

		// La solución está en esfuerzoMinimo[0][totalPosiciones-1]
		return esfuerzoMinimo[0][totalPosiciones - 1];
	}
}
