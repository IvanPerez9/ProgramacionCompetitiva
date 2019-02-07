/**
 * 
 */
package aceptaElReto;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
import java.util.Arrays;
import java.util.Scanner;

public class Problema100 {
	
	/* 
	 * Acepta el reto 100
	 * 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int casos = Integer.parseInt(entrada.nextLine());
		
		for (int i = 0; i < casos; i++) {
			
			String numeroIn = entrada.nextLine();
			while (numeroIn.length()< 4) {
				numeroIn = "0" + numeroIn;

			}
			
			int pasos = 0;
			int numero = Integer.parseInt(numeroIn);
			// Array de caracteres para ordenar
			char[] ascendente = numeroIn.toCharArray();
			char[] descendente = new char[ascendente.length];
			
			while (numero != 6174) {
				int aux = 0;
				Arrays.sort(ascendente); // Ordena solo ascendentemente, lo uso para recorrer al reves para el otro
				for (int j = (ascendente.length) -1  ; j >= 0; j--) {
					descendente[aux] = ascendente[j];
					aux++;
				}
				
				numero = (Integer.parseInt(String.valueOf(descendente)) - Integer.parseInt(String.valueOf(ascendente))) ;
				
				if (numero == 0) {
					pasos = 8;
					break;
				} else {
					String numeroIn2 = String.valueOf(numero) ;
					while (numeroIn2.length()< 4) {
						numeroIn2 = "0" + numeroIn2;
					}
					ascendente = numeroIn2.toCharArray();
					pasos ++;
				}
				
			}
			System.out.println(pasos);
		}	
		entrada.close();
		
	}
}
