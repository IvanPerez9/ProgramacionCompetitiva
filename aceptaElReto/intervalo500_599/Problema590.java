/**
 * 
 */
package intervalo500_599;

import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema590 {

	/*
	 * Problema 590 - A caballo por el viñedo
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] racimos;
		int numRacimos, numUvas;
		boolean suficiente;

		// Numero de racimos
		numRacimos = entrada.nextInt();
		// Numero de uvas necesarias
		numUvas = entrada.nextInt();

		while (numRacimos != 0 && numUvas != 0) {
			racimos = new int[numRacimos];
			for (int i = 0; i < racimos.length; i++) {
				racimos[i] = entrada.nextInt();
			}
			suficiente = Boolean.FALSE;

			// Suma de racimos consecutivos SOLO
			consecutivos(numUvas, numRacimos, suficiente, racimos);

			numRacimos = entrada.nextInt();
			numUvas = entrada.nextInt();
		}

		entrada.close();
	}

	public static void consecutivos(int numUvas, int numRacimos, boolean suficiente, int[] racimos) {
		int pos = 0;
		int uvasLlevar = 0;

		// Racimos consecutivos
		while (!suficiente && pos < numRacimos) {
			int uvasTotal = 0;
			int copyPos = pos;
			while (uvasTotal < numUvas && copyPos < numRacimos) {
				// Suma de consecutivos
				uvasTotal += racimos[copyPos];
				copyPos++;
			}
			// Tengo suficientes uvas
			if (uvasTotal >= numUvas) {
				if (uvasLlevar == 0) {
					uvasLlevar = uvasTotal;
				} else if (uvasTotal <= uvasLlevar) { // He encontrado una combinacion mejor
					uvasLlevar = uvasTotal;
					if (uvasTotal == numUvas) { // Mejor combinacion, que sea igual a lo pedido
						suficiente = true;
					}
				}
			}
			// Siguiente pos array
			pos++;
		}
		// Mostrar resultado
		System.out.println(uvasLlevar > 0 ? uvasLlevar : "IMPOSIBLE");
	}

}
