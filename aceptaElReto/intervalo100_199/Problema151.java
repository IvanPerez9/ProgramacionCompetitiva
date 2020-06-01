/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *         https://github.com/IvanPerez9
 */
public class Problema151 {

	public static void main(String[] args) {
		int numM;
		int[][] matriz;
		boolean condicion;
		try (Scanner entrada = new Scanner(System.in)) {

			numM = entrada.nextInt();

			while (numM != 0) {

				condicion = Boolean.TRUE;
				matriz = new int[numM][numM];
				for (int i = 0; i < numM; i++) {
					for (int j = 0; j < numM; j++) {
						matriz[i][j] = entrada.nextInt();
					}
				}
				// Comprobacion diagonal
				for (int i = 0; i < numM; i++) {
					for (int j = 0; j < numM; j++) {
						if (matriz[i][i] != 1) {
							condicion = Boolean.FALSE;
							break;
						}
					}
				}

				// Un lado y otro
				if (condicion) {
					for (int i = 0; i < numM; i++) {
						for (int j = 0; j < i; j++) {
							if (matriz[i][j] != 0) {
								condicion = Boolean.FALSE;
								break;
							}
						}
					}
					for (int i = 0; i < numM; i++) {
						for (int j = numM - 1; j > i; j--) { // Ojo al revés
							if (matriz[i][j] != 0) {
								condicion = Boolean.FALSE;
								break;
							}
						}
					}
				}

				String msg = (condicion) ? "SI" : "NO";
				System.out.println(msg);

				numM = entrada.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}
}
