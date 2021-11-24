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
public class Problema577 {

	/*
	 * Acepta el reto 577 - Cucharadas de sopa
	 */

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int minimo, maximo, reales, resta;
			int numCasos = entrada.nextInt();
			while (numCasos != 0) {
				minimo = entrada.nextInt();
				maximo = entrada.nextInt();
				reales = entrada.nextInt();
				resta = reales - minimo;
				System.out.println(resta <= maximo ? resta + 1 : reales - (reales - maximo) + 1);
				numCasos--;
			}

		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}

}
