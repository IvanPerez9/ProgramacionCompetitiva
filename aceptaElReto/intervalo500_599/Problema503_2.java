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
public class Problema503_2 {

	/*
	 * Acepta el reto 503 - Dados de Rol
	 */

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {

			int numCasos = entrada.nextInt();
			int dado1, dado2 = 0;
			for (int i = 0; i < numCasos; i++) {
				dado1 = entrada.nextInt();
				dado2 = entrada.nextInt();

				// Todas las combinaciones posibles - inicializo a 0 y luego sumo cada vez que
				// tenga una aparicion
				int[] combinations = new int[42];
				initializeZero(combinations);

				for (int k = 1; k <= dado1; k++) {
					for (int j = 1; j <= dado2; j++) {
						combinations[k + j]++;
					}
				}

				// Con el array relleno ya vale
				int maxVal = 0;
				int maximo = 0;
				for (int k = 1; k <= dado1 + dado2; k++) {
					if (combinations[k] > maxVal) {
						maxVal = combinations[k];
						maximo = k;
					}
				}

				System.out.print(maximo);

				// El resto si hay mas con maxVal
				for (int j = 1; j <= dado1 + dado2; j++) {
					if (combinations[j] == maxVal && j != maximo)
						System.out.print(" " + j);
				}

				// Fin
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}

	}

	/**
	 * Inicializo el array a cero
	 * 
	 * @param array
	 */
	public static void initializeZero(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}
}
