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
public class SietePicos {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			int montana = entrada.nextInt();
			while (montana != 0) {
				int[] alturas = new int[montana];
				for (int i = 0; i < montana; i++) {
					alturas[i] = entrada.nextInt();
				}
				int picos = 0;
				// Comprobar ciculares
				if (alturas[0] > alturas[alturas.length - 1] && alturas[0] > alturas[1]) {
					picos++;
				}
				if (alturas[alturas.length -2] < alturas[alturas.length-1] && alturas[alturas.length-1] > alturas[0] ) {
					picos++;
				}
				// Itero el resto de alturas que no son limites
				for (int i = 1; i < alturas.length -1; i++) {
					if (alturas[i-1] < alturas[i] && alturas[i] > alturas[i+1] ) {
						picos++;
					}
				}
				System.out.println(picos);
				montana = entrada.nextInt();
			}
		}
	}
}
