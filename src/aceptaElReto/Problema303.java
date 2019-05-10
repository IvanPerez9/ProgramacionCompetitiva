/**
 * 
 */
package aceptaElReto;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema303 {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(10);
			int a = entrada.nextInt();
			int b = entrada.nextInt();
			if (b == 0) {
				sb.append("DIVO");
			} else if (a < 0) {
				int cociente = a / b;
				if (b > 0) { // -7 3
					while (b * cociente > a) {
						cociente--;
					}
				}else {
					while (b * cociente > a) {
						cociente++;
					}
				}
				int resto = a - (b * cociente) ;
				sb.append(cociente + " " + resto );
			} else {
				sb.append(a / b + " " + a % b ); // division normal positiva
			}
			System.out.println(sb);
		}
		entrada.close();
	}
	
}
