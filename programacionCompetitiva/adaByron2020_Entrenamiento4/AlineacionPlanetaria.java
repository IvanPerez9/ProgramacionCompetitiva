/**
 * 
 */
package adaByron2020_Entrenamiento4;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class AlineacionPlanetaria {

public static void main(String[] args) {
		
	int numeroPlanetas = 0;
	boolean condicion = Boolean.TRUE;
		
	try(Scanner entrada = new Scanner(System.in)){
		while(condicion) {
			numeroPlanetas = entrada.nextInt();
			if (numeroPlanetas == 0) {
				condicion = Boolean.FALSE;
				return;
			}
			int ret = entrada.nextInt();
			for (int i = 0; i < numeroPlanetas -1; i++) {
				ret = mcm (ret , entrada.nextInt());
			}
			System.out.println(ret);
		}
	}
}
	
	private static int mcd (int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		
		return mcd (n2, n1 % n2);
	}
	
	private static int mcm (int n1 , int n2) {
		return n1 * (n2 / mcd (n1,n2));
	}
	
}
