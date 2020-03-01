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
public class ElAlcanceDeLasHistorias {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			int numCasos = entrada.nextInt();
			for (int i = 0; i < numCasos; i++) {
				int pags = entrada.nextInt();
				int diferencia, max, n2;
				diferencia = Integer.MIN_VALUE; // No puede empezar en 0, permite valores negativos
				int n1 = entrada.nextInt(); // Primero de todos
				max = n1;
				for (int j = 0; j < pags-1; j++) {
					n2 = entrada.nextInt();
					diferencia = Math.max(diferencia, max - n2);
					// Muevo 1
					n1 = n2;
					max = Math.max(max, n1);
				}
				System.out.println(diferencia);
			}
		}
	}
	
}
