/**
 * 
 */
package aceptaElReto;

import java.util.HashMap;
import java.util.Scanner;

/**
<<<<<<< HEAD
 * @date 2 feb. 2019
 * 
 * @author Iván - IvanPerez9
 *
=======
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
>>>>>>> 92f2f2ba17adb9d9b2460818582e699a362c459f
 */
public class Problema214 {

	public static void main(String[] args) {
<<<<<<< HEAD
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
=======
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		HashMap<String, Integer> reyes = new HashMap<>();
		
		while (num > 0) {
			reyes.clear();
			for (int i = 0; i < num; i++) {
				String rey = entrada.next();
				if (reyes.containsKey(rey)) {
					reyes.put(rey, reyes.get(rey)+1);
				} else {
					reyes.put(rey, 1);
				}
			}
			
			int numSucesores = entrada.nextInt();
			for (int i = 0; i < numSucesores; i++) {
				String suc = entrada.next();
				if (reyes.containsKey(suc)) {
					reyes.put(suc, reyes.get(suc)+1);
					System.out.println(reyes.get(suc));
				} else {
					reyes.put(suc, 1);
					System.out.println(reyes.get(suc));
				}
			}
			System.out.println();
			num = entrada.nextInt();
		}
		entrada.close();
>>>>>>> 92f2f2ba17adb9d9b2460818582e699a362c459f
	}
	
}
