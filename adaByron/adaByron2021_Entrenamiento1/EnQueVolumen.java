/**
 * 
 */
package adaByron2021_Entrenamiento1;

import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class EnQueVolumen {

	/*
	 * AdaByron 2021 - Entrenamiento 1
	 * 
	 * En que volumen - Problema 595 Acepta el Reto
	 */

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {

			int numEntrada = entrada.nextInt();

			for (int i = numEntrada; i > 0; i--) {
				int id = entrada.nextInt();
				System.out.println(id / 100);
			}

		} catch (Exception e) {
			System.out.println("Error al leer ");
			e.printStackTrace();
		}

	}

}
