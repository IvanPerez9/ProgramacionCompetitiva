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
	
	/*
	 * Otra forma -> aceptaElReto -> Problema458
	 */

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        while ((n = entrada.nextInt()) != 0) {
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = entrada.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(Math.max(nums[0] * nums[1], nums[n-1] * nums[n-2]));
        }
        entrada.close();
    }
}
