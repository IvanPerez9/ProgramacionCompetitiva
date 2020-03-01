/**
 * 
 */
package intervalo200_299;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema234 {

	/*
	 * Carreras de coches - 234
	 */
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		for (int i = 0; i < n; i++) {
			int nPilas = entrada.nextInt();
			int vMin = entrada.nextInt();
			
			int[] voltajes = new int[nPilas];
			for (int j = 0; j < voltajes.length; j++) {
				voltajes[j] = entrada.nextInt();
			}
			Arrays.sort(voltajes); // Ordeno 
			
			int numCoches = 0;
			int voltajeAux = 0;
			int ultimo = voltajes.length -1;
			int j = 0;
			
			while (j < ultimo) {
				voltajeAux = voltajeAux + voltajes[j] + voltajes[ultimo];
				j++;
				if (voltajeAux >= vMin) {
					numCoches++;
					ultimo--;
				} else {
					ultimo --;
				}
			}
			
			System.out.println(numCoches);
		}
		
		entrada.close();
	}
}
