/**
 * 
 */
package curso19;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class pitoPitoGorgorito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			int silabas = Integer.parseInt(entrada.next()); 
			int amigos = Integer.parseInt(entrada.next()); 
			int division = silabas % amigos ;  
			if (division == 0) {
				division = silabas;
			}
			int k = Integer.parseInt(entrada.next()); 
			while (k > 0) {
				int posicion = entrada.nextInt();
				if (division == posicion) { 
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
				k--;
			}
		}
		entrada.close();
	}
}
