/**
 * 
 */
package adaByron2020_Entrenamiento4;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class MeCaso {

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
