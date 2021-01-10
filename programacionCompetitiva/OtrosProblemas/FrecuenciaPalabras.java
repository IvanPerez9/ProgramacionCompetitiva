/**
 * 
 */
package OtrosProblemas;

import java.util.HashMap;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class FrecuenciaPalabras {

	public static void main(String[] args) {
		String texto = "hola que tal me llamo hola hola que como estás";
		String [] palabras = texto.split(" ");
		
		HashMap<String, Integer> frecuencia = new HashMap<String, Integer>();
		for (String word : palabras) {
			if (frecuencia.containsKey(word)) {
				frecuencia.put(word, frecuencia.get(word)+1);
			} else {
				frecuencia.put(word, 1);
			}
		}
		
		// Mostrar
		
		for (HashMap.Entry<String, Integer> conjunto : frecuencia.entrySet()) {
			System.out.printf("Palabra %s con frecuencia %d\n ", conjunto.getKey(), conjunto.getValue() );
		}
	}
	
}
