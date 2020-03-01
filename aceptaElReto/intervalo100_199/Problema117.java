/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @date 25 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema117 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = Integer.parseInt(entrada.nextLine());
		String[] persona = new String[n];
		if (n>0) {
			for (int i = 0; i < n; i++) {
				String[] split = entrada.nextLine().split(" ");
				String nombre = split[1];
				persona[i] = nombre;
				}
			for (String string : persona) {
				System.out.println("Hola, " + string + ".");
			}
		}
		entrada.close();
	}
}
