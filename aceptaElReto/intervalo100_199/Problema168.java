/**
 * 
 */
package intervalo100_199;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *         https://github.com/IvanPerez9
 */
public class Problema168 {

	/*
	 * Acepta el reto 168
	 * 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroFichas = entrada.nextInt();
		while (numeroFichas != 0 && numeroFichas >= 2) {
			int[] almacen = new int[numeroFichas];
			for (int i = 1; i < numeroFichas; i++) {
				almacen[i] = entrada.nextInt();
			}

			Arrays.sort(almacen);
			int[] aux = new int[numeroFichas];
			int[] arraySalida = generarArray(numeroFichas);

			for (int i = 1; i < almacen.length; i++) {
				if (arraySalida[i] != almacen[i]) {
					aux[i] = arraySalida[i];
				}
			}

			for (int i = 0; i < aux.length; i++) {
				if (aux[i] != 0) {
					System.out.println(aux[i]);
					break;
				}
			}
			numeroFichas = entrada.nextInt();
		}
		entrada.close();
	}

	public static int[] generarArray(int size) {
		int[] arraysalida = new int[size];
		for (int i = 1; i < size; i++) {
			arraysalida[i] = i;
		}
		return arraysalida;
	}

}
