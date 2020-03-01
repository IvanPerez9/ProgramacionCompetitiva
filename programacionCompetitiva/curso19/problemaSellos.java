/**
 * 
 */
package curso19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class problemaSellos {

	/*
	 * Enunciado: https://www.spoj.com/problems/STAMPS/
	 * 
	 * Minimizar el numero de amigos que necesita para llegar a los sellos necearios
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = Integer.parseInt(entrada.nextLine()); // Numero de casos prueba
		
		for (int i = 0; i < n; i++) {
			
			// Sellos que necesita y numero de amigos
			int numSellos = Integer.parseInt(entrada.next());
			int numAmigos = Integer.parseInt(entrada.next());
			entrada.nextLine();
			
			int array[] = new int[numAmigos];
			
			String [] listaSellos = entrada.nextLine().split(" ");
			int suma = 0;
			int amigos = 0;
			
			for (int j = 0; j < numAmigos; j++) {
				int valor = Integer.parseInt(listaSellos[j]);
				array[j] = valor;
				suma += valor;
			}
			
			if (suma<numSellos) {
				System.out.println("Scenario #"+(i+1)+":");
				System.out.println("imposible");
	            continue;
			} else if (suma == numSellos) {
				System.out.println("Scenario #"+(i+1)+":");
				System.out.println(numAmigos);
			} else {
				
				Arrays.sort(array); // Ordeno de menos a mayor
				// Arrays.sort(array , Collections.reverseOrder());
				
				for (int k = 0; k < array.length / 2; k++) { // Recorro solo la mitad, y de atrás adelante
					int aux = array[k];
					array[k] = array[array.length - k -1];
					array[array.length - k -1] = aux;
				}
				
				suma = 0;
				
				for (int j = 0; j < listaSellos.length; j++) {
					suma += array[j];
					amigos ++;
					if (suma >= numSellos) {
						break;
					}
				}
				
				System.out.println("Scenario #"+(i+1)+":");
                System.out.println(amigos);
			}
		}
		entrada.close();
	}
	
	
}
