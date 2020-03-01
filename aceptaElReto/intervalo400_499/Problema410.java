/**
 * 
 */
package intervalo400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema410 {
	
	public static final String saltarines = "SALTARINES";
	public static final String noirmales = "NORMALES";
	
	
	/*
	 * Acepta el reto 410 - Digitos Saltarines 
	 */

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); // Mejor este
		int n = Integer.parseInt(entrada.readLine());
		
		for (int i = 0; i < n; i++) {
			char[] numero = entrada.readLine().toCharArray();
			boolean[] vistos = new boolean[numero.length];
			int pos = 0;
			int longitud = numero.length;
			int todos = numero.length;
				
			while(!vistos[pos]) {
				vistos[pos] = true;
				pos = (pos + Character.getNumericValue(numero[pos]) ) % longitud;
				todos--;
			}
				
			if (pos == 0 && todos == 0) {
				System.out.println(saltarines);
			} else {
					System.out.println(noirmales);
			}
		}
	}
}
