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
public class Problema300 {
	  
	  /* 
	   * Acepta el reto 300
	   * Palabras pentavocálicas
	   * 
	   */

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int numero = Integer.parseInt(entrada.nextLine());
	    
	    for (int i = 0; i < numero; i++) {
	      String linea = entrada.nextLine().toLowerCase();
	      if ( (linea.indexOf('a') >= 0) && (linea.indexOf('e') >= 0) && (linea.indexOf('i') >= 0) && (linea.indexOf('o') >= 0) && (linea.indexOf('u') >= 0) ) {
	        System.out.println("SI");
	      } else {
	        System.out.println("NO");
	      }
	    }
	    entrada.close();
	  }
}
