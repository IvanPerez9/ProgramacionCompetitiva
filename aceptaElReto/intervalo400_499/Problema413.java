/**
 * 
 */
package intervalo400_499;

import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema413 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numCasos = entrada.nextInt();
		int ancho = 0;
		int alto = 0;
		int area = 0;

		while (numCasos > 0) {
			ancho = entrada.nextInt();
			alto = entrada.nextInt();
			area = alto * ancho;
			if (area % 2 == 0) {
				System.out.println(area / 2 + " " + area / 2);
			} else {
				System.out.println(((area / 2) + 1) + " " + ((area / 2)));
			}
			numCasos--;
		}
		entrada.close();
	}

}
