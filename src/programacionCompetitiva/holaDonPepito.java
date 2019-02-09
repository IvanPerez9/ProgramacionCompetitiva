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
public class holaDonPepito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			String nombre1 = entrada.next();
			String sexo1 = entrada.next();
			String nombre2 = entrada.next();
			String sexo2 = entrada.next();
			
			if (sexo1.equals("M")) {
				System.out.println("Hola Don " + nombre1);
			} else {
				System.out.println("Hola Donya " + nombre1);
			}
			
			if (sexo2.equals("M")) {
				System.out.println("Hola Don " + nombre2);
			} else {
				System.out.println("Hola Donya " + nombre2);
			}
		}
		entrada.close();
	}
}
