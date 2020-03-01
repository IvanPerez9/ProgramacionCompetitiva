/**
 * 
 */
package intervalo300_399;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema371 {

	 /* 
     * Acepta el reto 371
     * 
     */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	    int numeroTriangulos = entrada.nextInt();
	    
	    while (numeroTriangulos != 0) {
	      int salida = 0;
	      for(int i=numeroTriangulos; i>0; i--) {
	        salida += 3 * i;
	      }
	      System.out.println(salida);
	      numeroTriangulos = entrada.nextInt();
	    }
	    entrada.close();
	  }
	
}
