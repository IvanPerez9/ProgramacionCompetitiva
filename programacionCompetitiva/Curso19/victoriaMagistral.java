/**
 * 
 */
package Curso19;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class victoriaMagistral {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			int numero1 = Integer.parseInt(entrada.next());
			int numero2 = Integer.parseInt(entrada.next());
			
			System.out.println(numero1 / numero2);
		}
		entrada.close();
	}
	
}