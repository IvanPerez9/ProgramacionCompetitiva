/**
 * 
 */
package programacionCompetitiva;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class sumaRangos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			int N = Integer.parseInt(entrada.next());
			int[] array  = new int[N];
			for (int j = 0; j < N; j++) {
				array[j] = Integer.parseInt(entrada.next());
			}
			int nQuery = Integer.parseInt(entrada.next());
			for (int j = 0; j < nQuery; j++) {
				int rango1 = Integer.parseInt(entrada.next());
				int rango2 = Integer.parseInt(entrada.next());
				int suma = 0;
				for (int k = rango1-1; k < rango2 ; k++) {
					suma += array[k];
				}
				System.out.println(suma);
			}
			if (!(i == n-1)) {
				System.out.println("---");
			}
		}
		entrada.close();
	}
	
}