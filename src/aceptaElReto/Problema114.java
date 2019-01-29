/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @date 25 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema114 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = Integer.parseInt(entrada.nextLine());
		int[] guardar = new int[n];
		for (int i = 0; i < n; i++) {
			int num = entrada.nextInt();
		    int fac=1;
			for (int j=1;j<=num ;j++){
				fac *= j;
			}
			System.out.println(fac % 10);
			//guardar[i] = (fac % 10);
		}
//		for (int i : guardar) {
//			System.out.println(i);
//		}
	}
}
