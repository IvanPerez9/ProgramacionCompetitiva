/**
 * 
 */
package intervalo300_399;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema380 {
	
	/*
	 * Acepta el Reto - 380
	 * 
	 * Me caso
	 */

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			int numCasos;
			do {
				numCasos = entrada.nextInt();
				int sumaTotal = 0;
				for (int i = 0; i < numCasos; i++) {
					sumaTotal += entrada.nextInt();
				}
				if (sumaTotal != 0) {
					System.out.println(sumaTotal);
				}
			} while (numCasos != 0);	
		} catch (Exception e) {
			System.out.println("Error al iniciar scanner");
		}
	}
	
}
