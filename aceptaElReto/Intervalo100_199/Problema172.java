/**
 * 
 */
package Intervalo100_199;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *         https://github.com/IvanPerez9
 */
public class Problema172 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String mesa;
		mesa = entrada.nextLine();
		while (!(mesa).equals("0")) {
			String panes = mesa.substring(mesa.indexOf(' ') + 1, mesa.length());
			if (panes.indexOf('D') != -1 && panes.indexOf('I') != -1) {
				System.out.println("ALGUNO NO COME");
			} else {
				System.out.println("TODOS COMEN");
			}
			mesa = entrada.nextLine();
		}
	}

}
