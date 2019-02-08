/**
 * 
 */
package aceptaElReto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema185 {

	/* Acepta el reto 185
	   * 
	   * Potitos
	   * 
	   * hasmap con cada ingrediente si o no
	   * 
	   * SI: patata maiz tomate FIN
	   * 
	   * 
	   * TODO
	   */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		Set<String> conjuntoSI = new HashSet<>();  
		Set<String> conjuntoNO = new HashSet<>(); 
		
		while (num != 0) {
			for (int i = 0; i < num; i++) {
				String booleanStr = entrada.next();
				String ingrediente;
				if (booleanStr.startsWith("SI:")) {
					while (!entrada.equals("FIN")) {
						ingrediente = entrada.next();
						entrada.next();
						conjuntoSI.add(ingrediente);
					}	
				}else {
					while (!entrada.equals("FIN")) {
						ingrediente = entrada.next();
						entrada.next();
						if (!conjuntoSI.contains(ingrediente)) {
							conjuntoNO.add(ingrediente);
						}
					}
				}
			}
			System.out.println(conjuntoNO);
			num = entrada.nextInt();
		}
	}
}
