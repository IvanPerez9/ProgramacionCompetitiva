/**
 * 
 */
package OtrosProblemas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class FrecuenciaPalabras {

	public static void main(String[] args) throws IOException {
		//String texto = "hola que tal me llamo hola hola que como estás";
		//String [] palabras = texto.split(" ");
		
		
		BufferedReader br = new BufferedReader(new FileReader("/home/ivan/GitHub/ProgramacionCompetitiva/programacionCompetitiva/OtrosProblemas/textoLeer.txt"));
		String texto2 = br.readLine();
		texto2 = texto2.toLowerCase();
		String [] palabras = texto2.split(" ");
		
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
