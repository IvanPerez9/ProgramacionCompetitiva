/**
 * 
 */
package adaByron2020_Entrenamiento3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class MenteTimonel {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)) {
			int num = entrada.nextInt();
			while (num != 0) {
				int almacenPositivo[] = new int[num];
				int almacenNegativo[] = new int[num];
				int pos = 0;
				int neg = 0;
				boolean positive = false;
				boolean negative = false;
				for (int i = 0; i < num; i++) {
					int n = entrada.nextInt();
					if (n > 0) {
						almacenPositivo[pos++]=n;
						positive = true;
					} else {
						almacenNegativo[neg++]=n;
						negative = true;
					}
				}
				Arrays.sort(almacenPositivo);
				Arrays.sort(almacenNegativo);
				// Todos positivos, Todos negativos y mezcla
				if (positive && !negative) {
					System.out.println(almacenPositivo[num-1] * almacenPositivo[num-2]);
				} else if (!positive) {
					System.out.println(almacenNegativo[0] * almacenNegativo[1]);
				} else {
					int ret = (pos > 1) ? almacenPositivo[num-1] * almacenPositivo[num-2] : -1;
					int ret2 = (neg > 1) ? almacenNegativo[0] * almacenNegativo[1] : -1;
					// Si solo hay más de 1 de casa
					if (ret == -1 && ret2 == -1) {
						System.out.println(almacenNegativo[0] * almacenPositivo[num-1]);
					} else {
						System.out.println(Math.max(ret, ret2));
					}
				}
				num = entrada.nextInt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
