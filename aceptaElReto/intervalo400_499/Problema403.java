/**
 * 
 */
package intervalo400_499;

import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema403 {

	/*
	 * Acepta el reto 403 - En campus de futbol
	 */
	public static void main(String[] args) {

		final String si = "SI";
		final String no = "NO";
		
		try (Scanner entrada = new Scanner(System.in)) {

			int ancho, largo, metros, campos;

			int numCasos = entrada.nextInt();
			while (numCasos-- != 0) {
				boolean check = Boolean.FALSE;
				metros = entrada.nextInt();
				campos = entrada.nextInt();
				ancho = 90 * 45;
				largo = 120 * 90;

				for (int i = 90; i < 120; i++) {
					for (int j = 45; j < 90; j++) {
						if (campos*ancho <= metros && campos*largo >= metros) {
							check = Boolean.TRUE;
						}
					}
				}
				System.out.println(check ? si : no);
			}

		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}

	}
}
