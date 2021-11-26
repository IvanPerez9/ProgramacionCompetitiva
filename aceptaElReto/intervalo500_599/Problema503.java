/**
 * 
 */
package intervalo500_599;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema503 {

	/*
	 * Acepta el reto 503 - Dados de Rol
	 */

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			
			int numCasos = entrada.nextInt();
			int dado1, dado2 = 0;
			for (int i = 0; i < numCasos; i++) {
				dado1 = entrada.nextInt();
				dado2 = entrada.nextInt();
				HashMap<Integer, Integer> probabilidad = new HashMap<>();
				
				// Todas las combinaciones posibles - inicializo a 0 y luego sumo cada vez que tenga una aparicion
				int[] combinations = new int[dado1 * dado2];
				initializeZero(combinations);
				
		        for(int k = 1; k <= dado1; k++){
		            for(int j = 1; j <= dado2; j++){
		            	combinations[k + j] ++;
		            }
		        }
		        
		        // Mapa clave valor -> combinacion / numero de veces que existe
		        for (int j = 1; j < combinations.length; j++) {
					probabilidad.put(j, combinations[j]);
				}
		        
		        // El maximo -> Valor
		        int maxVal = Collections.max(probabilidad.values());
		        int [] maximo = new int [dado1];
		        initializeZero(maximo);
		        int pos = 0;
		        
		        for (Entry<Integer, Integer> entry : probabilidad.entrySet()) {
		            if (entry.getValue().equals(maxVal)) {
		                maximo[pos] = entry.getKey();
		                pos++;
		            }
		        }
		        /* Funcional
		        maximo = probabilidad.entrySet().stream()
	              .filter(entry -> Objects.equals(entry.getValue(), max))
	              .map(Map.Entry::getKey)
	              .findFirst().get();
	             */
		        
		        for (int j = 0; j < maximo.length; j++) {
		        	if (maximo[j] != 0) {
		        		System.out.print(maximo[j] + " ");
		        	}
				}
		        // Fin
		        System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		
	}
	
	/**
	 *  Inicializo el array a cero
	 * @param array
	 */
	public static void initializeZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
        	array[i] = 0;
        }
    }
}
