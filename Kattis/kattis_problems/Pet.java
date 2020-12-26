/**
 * 
 */
package kattis_problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class Pet {
	
	static final int CONTESTANTS = 5;
	static final int JUDGES = 4;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int concursante = 1;
		Map<Integer, Integer> claveValor = new HashMap<Integer, Integer>();
		for (int i = 0; i < CONTESTANTS; i++) {
			int suma = 0;
			for (int j = 0; j < JUDGES ; j++) {
				suma += entrada.nextInt();
			}
			claveValor.put(concursante, suma);
			concursante++;
		}
		int max = Collections.max(claveValor.values());
		int key = keyByValue(claveValor, max);
		System.out.println(key + " " + max);
		entrada.close();
	}
	
	
	public static int keyByValue (Map<Integer, Integer> hashmap1, int value) {
		 if (hashmap1.containsValue(value))
	        {
	            for (Entry<Integer, Integer> e : hashmap1.entrySet()) {
	                Integer key = e.getKey();
	                Integer value2 = e.getValue();
	                if (value == value2)
	                {
	                    return key;
	                }
	            }
	        }
		 System.err.println("No existe valor en el mapa");
	     return 0;
	}
		
}
