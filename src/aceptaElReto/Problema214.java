/**
 * 
 */
package aceptaElReto;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema214 {

	public static void main(String[] args) {
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
	}
	
}
