/**
 * 
 */
package intervalo400_499;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema458 {

	/*
	 * En la mente del timonel - Acepta el reto 458
	 * 
	 * Otra forma -> adaByron_Entrenamiento3 - MenteTimonel
	 */
	
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)) {
			int num = entrada.nextInt();
			while (num != 0) {
				int almacen[] = new int[num];
				boolean positive = false;
				boolean negative = false;
				for (int i = 0; i < num; i++) {
					int n = entrada.nextInt();
					if (n > 0) {
						almacen[i]=n;
						positive = true;
					} else {
						almacen[i]=n;
						negative = true;
					}
				}
				Arrays.sort(almacen);
				// Todos positivos, Todos negativos y mezcla
				if (positive && !negative) {
					System.out.println(almacen[num-1] * almacen[num-2]);
				} else if (!positive) {
					System.out.println(almacen[0] * almacen[1]);
				} else {
					System.out.println(Math.max(almacen[0] * almacen[1], almacen[num-1] * almacen[num-2]));
				}
				num = entrada.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
		}
	}
}
