/**
 * 
 */
package intervalo300_399;

import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema362 {

	public static final String SI = "SI";
	public static final String NO = "NO";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numCasos = entrada.nextInt();
		int dia = 0;
		int mes = 0;

		while (numCasos > 0) {
			dia = entrada.nextInt();
			mes = entrada.nextInt();
			if ((dia == 25) && (mes == 12)) {
				System.out.println(SI);
			} else {
				System.out.println(NO);
			}
			numCasos--;
		}
		entrada.close();
	}

}
