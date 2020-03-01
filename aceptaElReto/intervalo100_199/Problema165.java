/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema165 {
	
	  /* Acepta el reto 165
	   * 
	   * Si todos sus digitos son pares
	   * 
	   */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		String number;
		int aux = 0;
		
		while (num >= 0) {
			boolean par = true;
			number = String.valueOf(num);
			for (int i = number.length()-1; i >= 0; i--) {
				aux = num/(int)Math.pow(10, i);
				
				if (aux % 2 != 0) {
					par = false;
					break;
				}
			}
			
			System.out.println(par ? "YES" : "NO");
			num = entrada.nextInt();
		}
		entrada.close();
	}
}