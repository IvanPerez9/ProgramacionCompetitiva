/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 *  
 *  Acepta el Reto 191 - Los problemas de ser rico
 *  
 */
public class Problema191 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numCasos = entrada.nextInt();
		int compartimientos = 0;
		int capacidadMax = 0;
		int diferencia = 0;
		
		while (numCasos > 0) {
			compartimientos = entrada.nextInt();
			capacidadMax = entrada.nextInt();
			diferencia = entrada.nextInt();
			int sum = capacidadMax;
			for (int i = 1; i < compartimientos; i++) {
				sum += capacidadMax - diferencia;
				capacidadMax -= diferencia;
			}
			System.out.println(sum);
			numCasos--;
		}
		entrada.close();
	}
	
}
