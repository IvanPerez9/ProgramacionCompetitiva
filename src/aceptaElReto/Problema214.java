/**
 * 
 */
package aceptaElReto;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @date 2 feb. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema214 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numero = entrada.nextInt();
		
		String linea;
		HashMap<String, Integer> reyes = new HashMap<String, Integer>();
		
		while (numero > 0) {
			for (int i = 0; i < numero; i++) {
				linea = entrada.next();
				if (reyes.containsKey(linea)) {
					reyes.put(linea, +1);
				}else {
					reyes.put(linea, 1);
				}
			}
		}
	}
	
}
