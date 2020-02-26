/**
 * 
 */
package Intervalo200_299;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema265 {

	/* 
     * 265
     */

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		String n ;
		while ( ! (n = entrada.nextLine()).startsWith("0"))  {
			int longitud = n.length();
			int num = Integer.parseInt(n);
			int suma = num;
			while(longitud > 0) {
				suma += num % (Math.pow(10, --longitud)) ;
			}
			System.out.println(suma);
		}
		entrada.close();
	}
}
