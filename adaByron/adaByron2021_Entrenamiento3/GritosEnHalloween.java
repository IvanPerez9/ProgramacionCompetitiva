/**
 * 
 */
package adaByron2021_Entrenamiento3;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class GritosEnHalloween {

	/*
	 * AdaByron 2021 - Entrenamiento 3
	 * 
	 * Gritos en Halloween - Acepta el reto 574
	 */
	public static void main(String[] args) {

		String grito = "BUH";
		int orden, letra;

		try (Scanner entrada = new Scanner(System.in)) {
			while (entrada.hasNext()) {
				orden = entrada.nextInt();
				letra = entrada.nextInt();
				String gritoCompleto = gritos(grito, orden);
				System.out.println(gritoCompleto.charAt(letra - 1));
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}

	}

	/**
	 * Caso base si es el primer grito, caso recursivo añadiendo al grito "U"
	 * 
	 * @param grito
	 * @param numeroGritos
	 * @return gritoCompleto segun el orden dado
	 */
	public static String gritos(String grito, int numeroGritos) {

		String b = "B";
		String u = "U";
		String h = "H";

		if (numeroGritos == 1) {
			return grito;
		} else {
			String nuevoGrito = b.concat(String.join("", Collections.nCopies(numeroGritos, u))).concat(h);
			String gritoAnterior = b.concat(String.join("", Collections.nCopies(numeroGritos - 1, u))).concat(h);
			return gritos(gritoAnterior, numeroGritos - 1) + nuevoGrito + gritos(gritoAnterior, numeroGritos - 1);
		}
	}

}
